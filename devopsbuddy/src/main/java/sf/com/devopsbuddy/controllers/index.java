package sf.com.devopsbuddy.controllers;

 
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
public class index {
	
	public static final org.slf4j.Logger LOG = LoggerFactory.getLogger(index.class); 

	@RequestMapping("/")
	public String indexController() {
		LOG.info("Real message logging started now {} ","try me");
		return "index";
	}
}
