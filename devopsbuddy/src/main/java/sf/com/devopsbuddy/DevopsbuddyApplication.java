package sf.com.devopsbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("web.controllers")
public class DevopsbuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsbuddyApplication.class, args);
	}
}
