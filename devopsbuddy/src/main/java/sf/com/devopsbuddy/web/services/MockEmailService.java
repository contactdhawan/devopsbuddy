package sf.com.devopsbuddy.web.services;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.mail.SimpleMailMessage;


public class MockEmailService extends AbstractEmailService {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage) {
		log.info("This is sample email");
		log.info("This is email {}", simpleMailMessage.getSubject());
	}

}
