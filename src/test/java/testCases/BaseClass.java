package testCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

public class BaseClass {
	public static WebDriver driver;
	ReadConfig rc=new ReadConfig();
	public String baseUrl=rc.getBaseUrl();
	
//	@Parameters("browser")
	@BeforeClass
	public void setUp() {
		String br="chrome";
		switch (br) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+rc.getChromePath() );
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;

		default:
			break;
		}
	}
	
	
	@AfterClass
	public void tearDown() {
		
	}
}
