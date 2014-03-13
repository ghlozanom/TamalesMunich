package com.gabloz.tamalmunich.business.helpers;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.gabloz.tamalmunich.business.dto.ContactMessage;

/**
 * Provides helper methods to work with emails 
 * 
 * @author      Gabriel Lozano
 * */
public class EMailHelper {
	
	private static EMailHelper emailHelper = null;	
	
	/**
	 * Returns a unique instance of this class (Singleton pattern)
	 * 
	 * @return a singleton EmailHelper instance
	 */
	public static EMailHelper getInstance() {
		if(emailHelper == null ){
			emailHelper = new EMailHelper();
		}
		return emailHelper;
	}	
	
	/**
	 * Only accessible from the same class (Singleton pattern)
	 */
	private EMailHelper(){
	}

	/**
	 * Sends a contact message from the visitor to the official address of the application
	 * (the address defined in PortfolioConstants.PORTFOLIO_APP_ADDRESS). A confirmation
	 * message is sent back to the user.
	 * 
	 * @param contactMessage
	 * @throws PortfolioBusinessException if the user could not be sent
	 */
	public void sendMessage(ContactMessage contactMessage) {
		
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);
		
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(contactMessage.getFromEmail(), 
					contactMessage.getFromEmailNickname()));
			message.addRecipient(Message.RecipientType.TO,
					new InternetAddress(contactMessage.getEmail()) );
			message.setSubject( contactMessage.getSubject() );
			message.setText(contactMessage.getMessage());
			Transport.send(message);
			
			
		} catch (UnsupportedEncodingException e) {
//			throw new PortfolioBusinessException(MessageHelper.MESSAGE_NOT_SENT);
		} catch (MessagingException e) {
//			throw new PortfolioBusinessException(MessageHelper.MESSAGE_NOT_SENT);
		}		
	}
}
