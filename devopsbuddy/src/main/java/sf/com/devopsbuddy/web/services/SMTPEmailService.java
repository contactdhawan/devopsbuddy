package sf.com.devopsbuddy.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SMTPEmailService extends AbstractEmailService {
	private static final Logger log = LoggerFactory.getLogger(SMTPEmailService.class);

	@Autowired
	MailSender mailSender;

	@Value("${spring.mail.username}")
	private String spring_mail_username;
	
	@Override
	public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage) {
		log.info("Send the real email");
		log.info("${spring.mail.username}"+spring_mail_username);
		mailSender.send(simpleMailMessage);
		log.info("email send");
	}

}
