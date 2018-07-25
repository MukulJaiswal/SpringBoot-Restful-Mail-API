package com.mail.demo.model;

import org.springframework.stereotype.Component;

/**
 * Date :July 25,2018
 * 
 * @author MukulJaiswal
 * @version 1.0
 *
 */
@Component
public class User {

	private String firstName;
	private String lastName;
	private String emailAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
