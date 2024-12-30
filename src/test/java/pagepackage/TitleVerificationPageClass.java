package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basepackage.BiotiqueBaseClass;

public class TitleVerificationPageClass extends BiotiqueBaseClass {
	
	public TitleVerificationPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titleVerification()
	{
		String expectedTitle="https://www.biotique.com";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
