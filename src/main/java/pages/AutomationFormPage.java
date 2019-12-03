package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutomationFormPage extends PageBase {

	public AutomationFormPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(name="firstname")
	WebElement firstname ;
	@FindBy(id="lastname")
	WebElement lastname ;
	@FindBy(id="sex-0")
	WebElement male ;
	@FindBy(id="exp-4")
	WebElement experience ;
	@FindBy(id="profession-0")
	WebElement manualtester ;
	@FindBy(id="profession-1")
	WebElement automationtester ;
	@FindBy(id="tool-2")
	WebElement automationtool ;
	@FindBy(id="continents")
	WebElement continents ;
	@FindBy(id="selenium_commands")
	WebElement selenium_commands ;
	@FindBy(id="submit")
	WebElement button ;
	
	public void runtestonregistrationpage (String fname,String lname,String Australiaword,String Browser,String Navigation) throws InterruptedException
	{
	writehere(firstname, fname);
	writehere(lastname, lname);
	clickbutton(male);
	male.sendKeys(Keys.TAB);
	experience.sendKeys(Keys.TAB);
	clickbutton(experience);
	clickbutton(manualtester);
	clickbutton(automationtester);
	automationtool.sendKeys(Keys.TAB);
	clickbutton(automationtool);
	selectobj = new Select(continents);
	selectobj.selectByVisibleText(Australiaword);
	selectobj = new Select(selenium_commands);
	selectobj.selectByVisibleText(Browser);
	selectobj.selectByVisibleText(Navigation);
	clickbutton(button);
	}
	
}
