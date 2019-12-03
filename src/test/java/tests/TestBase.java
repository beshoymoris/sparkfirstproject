package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void startbrowser ()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
				+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
	}
	@AfterSuite
	public void closebrowser ()
	{
		driver.quit();
	}

}
