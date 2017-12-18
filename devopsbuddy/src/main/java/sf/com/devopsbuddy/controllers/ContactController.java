package sf.com.devopsbuddy.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sf.com.devopsbuddy.domain.Feedback;
import sf.com.devopsbuddy.web.services.EmailService;

@Controller
public class ContactController {

	public static final Logger log = LoggerFactory.getLogger(ContactController.class);
	public static final String CONTACT_PAGE = "/copy/contact";

	public static final String CONTACT_KEY = "feedback";

	@Autowired
	EmailService emailService;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContact(ModelMap model) {
		Feedback feedback = new Feedback();
		model.addAttribute(ContactController.CONTACT_KEY, feedback);
		return ContactController.CONTACT_PAGE;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String contactPost(@ModelAttribute(ContactController.CONTACT_KEY) Feedback feedback) {
		log.info("Feedbak message {}", feedback);
		emailService.sendEmailFeedback(feedback);
		return ContactController.CONTACT_PAGE;
	}
}
