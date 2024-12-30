package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BiotiqueBaseClass;

public class CreateAccountPageClass extends BiotiqueBaseClass{
	
	@FindBy(name="customer[first_name]")
	WebElement fname;
	
	@FindBy(name="customer[last_name]")
	WebElement lname;
	
	@FindBy(name="customer[email]")
	WebElement email;
	
	@FindBy(name="customer[password]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"create_customer\"]/button")
	WebElement create;
	
	public CreateAccountPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount() throws InterruptedException
	{
		fname.sendKeys("Krishna");
		lname.sendKeys("Anoop");
		email.sendKeys("krishnakviswan96@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);		
		password.sendKeys("Krishna@123");
		create.click();
	}

}
