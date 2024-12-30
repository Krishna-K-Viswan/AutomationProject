package pagepackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BiotiqueBaseClass;

public class LoginPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/div[1]/div/div/div[5]/ul/li[3]/a/span")
	WebElement login;
	
	@FindBy(linkText="Create Account")
	WebElement createaccount;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws InterruptedException
	{
		login.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		createaccount.click();
	}

}
