package sf.com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class i18nconfig {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource msgsource = new ReloadableResourceBundleMessageSource();
		msgsource.setBasename("classpath:i18n/messages");
		msgsource.setCacheSeconds(1800);
		return msgsource;
	}

}
