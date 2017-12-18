package sf.com.devopsbuddy.web.services;

import org.springframework.mail.SimpleMailMessage;

import sf.com.devopsbuddy.domain.Feedback;

public interface EmailService {

	public void sendEmailFeedback(Feedback feedback);
	
	public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage);
}
