package sf.com.devopsbuddy.web.services;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class I18nService {

	@Autowired
	public MessageSource messageSource;
	
	
	public String getMessage(String messageId) {
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId,locale);
	}
	
	public String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId,null,locale);
		
	}
}
