package pagepackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.BiotiqueBaseClass;

public class SkinMouseHoverPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"link_2\"]/span")
	WebElement skin;
	
    @FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/nav/div/ul/li[2]/div/div/div/div[1]/ul/li[1]/a")
    WebElement facewash;
	
	public SkinMouseHoverPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void skinMouseHover()
	{
		//explicitwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		act.moveToElement(skin).perform();
		wait.until(ExpectedConditions.elementToBeClickable(facewash)).click();
	}

}
