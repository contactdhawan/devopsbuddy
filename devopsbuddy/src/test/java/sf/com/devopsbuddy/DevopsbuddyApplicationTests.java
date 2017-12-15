package sf.com.devopsbuddy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;
import sf.com.devopsbuddy.web.services.I18nService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Autowired
	I18nService i18nService;

	@Test
	public void contextLoads() {
		String extpectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actualResult = i18nService.getMessage(messageId);
		Assert.assertEquals("Both string are not same", extpectedResult, actualResult);
	}

}
