package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver ;
	public Select selectobj ;
	public Actions actions ;
	public PageBase (WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	protected static void clickbutton (WebElement lclick)
	{
		lclick.click();
	}
	protected static void writehere (WebElement txt , String value)
	{
		txt.sendKeys(value);
	}

}
