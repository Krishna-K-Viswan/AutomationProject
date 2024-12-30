package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BiotiqueBaseClass;

public class SignInPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/div[1]/div/div/div[5]/ul/li[3]/a/span")
	WebElement login;
	
	@FindBy(name="customer[email]")
	WebElement email;
	
	@FindBy(name="customer[password]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")
	WebElement signin;
	
	public SignInPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signIn()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", login);
		login.click();
		email.sendKeys("krishnakviswan96@gmail.com");
		password.sendKeys("Krishna@123");
		signin.click();
	}

}
