package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AutomationFormPage;


public class AutomationFormTest extends TestBase {

AutomationFormPage autoobj ;
@Test (priority=1,alwaysRun=true)
public void usercanfillautomationform () throws InterruptedException
{
	autoobj = new AutomationFormPage(driver);
	autoobj.runtestonregistrationpage("first","last","Australia","Browser Commands","Navigation Commands");
	Thread.sleep(500);
	String url = driver.getCurrentUrl();
	Thread.sleep(500);
	System.out.println(url);
	Assert.assertEquals(url, "https://www.toolsqa.com/automation-practice-form/?firstname=first&sex=Male&exp=5&profession=Manual+Tester&profession=Automation+Tester&photo=&tool=Selenium+Webdriver&continents=AUS&selenium_commands=Browser+Commands&selenium_commands=Navigation+Commands&submit=");
	
	
}
	
}
