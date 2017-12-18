package sf.com.devopsbuddy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import sf.com.devopsbuddy.web.services.EmailService;
import sf.com.devopsbuddy.web.services.SMTPEmailService;

@Configuration
@Profile("prod")
@PropertySource("file:/${user.home}/devopsbuddy/application-prod.properties")
public class ProdConfig {

	@Value("${spring.mail.username}")
	private String spring_mail_username;
	
	ProdConfig(){
		System.out.println("${spring.mail.username}"+spring_mail_username);
	}
	
	@Bean
	public EmailService getEmailService() {
		return new SMTPEmailService();
	}
}
