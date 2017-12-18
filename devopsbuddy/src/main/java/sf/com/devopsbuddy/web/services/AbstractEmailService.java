package sf.com.devopsbuddy.web.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import sf.com.devopsbuddy.domain.Feedback;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.to.address}")
	private String defaultToAddress;

	protected SimpleMailMessage prepareSimpleMessage(Feedback feedback) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setTo(defaultToAddress);
		smm.setFrom(feedback.getEmail());
		smm.setSubject(feedback.getFirstName() + " " + feedback.getLastName());
		smm.setText(feedback.getFeedback());
		return smm;
	}

	@Override
	public void sendEmailFeedback(Feedback feedback) {
		sendGenericEmailMessage(prepareSimpleMessage(feedback));
	}

}
