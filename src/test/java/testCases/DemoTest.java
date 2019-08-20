package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoTest extends BaseClass {

	
	@Test
	public void demo() {
		driver.get(baseUrl);
		
	}
}
