package com.mail.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.demo.model.User;
import com.mail.demo.service.MailService;

/**
 * This class contains a Mail API developed using Spring Boot
 * 
 * @author MukulJaiswal
 *
 */
@RestController
public class RegistrationController {

	@Autowired
	private MailService notificationService;

	@Autowired
	private User user;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("send-mail")
	public String send() {

		/*
		 * Creating a User with the help of User class that we have declared. Setting
		 * the First,Last and Email address of the sender.
		 */
		user.setFirstName("Mukul");
		user.setLastName("Jaiswal");
		user.setEmailAddress("mukul.jaiswal786@gmail.com"); //Receiver's email address

		/*
		 * Here we will call sendEmail() for Sending mail to the sender.
		 */
		try {
			notificationService.sendEmail(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}

	/**
	 * 
	 * @return
	 * @throws MessagingException
	 */
	@RequestMapping("send-mail-attachment")
	public String sendWithAttachment() throws MessagingException {

		/*
		 * Creating a User with the help of User class that we have declared. Setting
		 * the First,Last and Email address of the sender.
		 */
		user.setFirstName("Mukul");
		user.setLastName("Jaiswal");
		user.setEmailAddress("mukul.jaiswal786@gmail.com"); //Receiver's email address

		/*
		 * Here we will call sendEmailWithAttachment() for Sending mail to the sender
		 * that contains a attachment.
		 */
		try {
			notificationService.sendEmailWithAttachment(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}
}
