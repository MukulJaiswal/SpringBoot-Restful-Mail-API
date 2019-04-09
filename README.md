# SpringBoot-Restful-Mail-API

This Repository contains Restful Api for sending E-mail using `smtp.gmail.com` host.

## Download or clone this project as :

```
Download or clone -> Import project ->Existing Maven Projects -> Run as Spring Boot project
```
## APIs Developed for  :

```
1.sendMail                   

2.sendMailWithAttachment

```
## Edit sender's E-mail address and password at application.properties file.
### Directory location src/main/resource/application.properties
```
spring.mail.username = *********@gmail.com	 
spring.mail.password = *********
```
## Write receiver's email address at RegistrationController.java
```
user.setEmailAddress("Your_Email_Address");
```
## APIs are accessible at the link :

* Send Mail without Attachment :
```
http://localhost:8080/send-mail
```
* Send Mail with Attachment :
```
http://localhost:8080/send-mail-attachment
```
## Detailed explanation can be found at :
<a href= "https://medium.com/cornercode/sending-e-mail-using-spring-boot-rest-api-16bf9c0697aa">https://medium.com/cornercode/sending-e-mail-using-spring-boot-rest-api-16bf9c0697aa</a>

## Working video 

<a href="https://www.youtube.com/watch?v=_f7pzqphMMU
" target="_blank">Click Here !</a>
  
## License

This project is licensed under the Apache License 2.0 - see the [LICENSE.md](LICENSE.md) file for details

## Author

* **Mukul Jaiswal** -
