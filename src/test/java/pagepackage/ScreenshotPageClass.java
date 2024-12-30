package pagepackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basepackage.BiotiqueBaseClass;

public class ScreenshotPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/div[1]/div/div/div[3]/div/predictive-search/form/button")
	WebElement searchbuttonimage;
	
	public ScreenshotPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void screenShot() throws IOException
	{
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("./screenshot/image.png"));
		
		File searchButton=searchbuttonimage.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(searchButton, new File("./screenshot/searchbutton.png"));
	}
	
}
