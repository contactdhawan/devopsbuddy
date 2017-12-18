package sf.com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import sf.com.devopsbuddy.web.services.EmailService;
import sf.com.devopsbuddy.web.services.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/devopsbuddy/application-dev.properties")
public class DevelopmentConfig {

	@Bean
	public EmailService getEmailService() {
		return new MockEmailService();
	}
}
