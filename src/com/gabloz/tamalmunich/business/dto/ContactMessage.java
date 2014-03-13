package com.gabloz.tamalmunich.business.dto;


/**
 * Model class that holds a Contact message
 * 
 * @author Gabriel Lozano
 *
 */
public class ContactMessage {
	
	private String name;
	private String email;
	private String message;
	private String fromEmail;
	private String fromEmailNickname;
	private String subject;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public String getFromEmailNickname() {
		return fromEmailNickname;
	}
	public void setFromEmailNickname(String fromEmailNickname) {
		this.fromEmailNickname = fromEmailNickname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
