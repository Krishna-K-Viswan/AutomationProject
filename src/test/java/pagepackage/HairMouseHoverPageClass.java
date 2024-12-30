package pagepackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.BiotiqueBaseClass;

public class HairMouseHoverPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"link_3\"]/span")
	WebElement hair;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/nav/div/ul/li[3]/div/div/div/div[2]/ul/li[3]/a")
	WebElement dryhair;
	
	@FindBy(xpath="/html/body/main/div[3]/section/div/div[2]/div/div/div/form[1]/div/div/div/div[3]/button")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/div[10]/div[1]/div[1]/div/div/span")
	WebElement close;
	
	@FindBy(xpath="/html/body/main/div[3]/section/div/div[2]/div/div/div/form[2]/div/div/div/div[3]/button")
	WebElement addtocart2;
	
	@FindBy(xpath="/html/body/div[10]/div[1]/div[2]/div/div[4]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[2]")
	WebElement increase;
	
	@FindBy(xpath="/html/body/div[10]/div[1]/div[3]/div[1]/div/form/div/div[2]/div/button")
	WebElement gotocart;
	
	public HairMouseHoverPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hairMouseHover() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		act.moveToElement(hair).perform();
		wait.until(ExpectedConditions.elementToBeClickable(dryhair)).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		addtocart.click();
		Thread.sleep(3000);
		close.click();
		Thread.sleep(3000);
		addtocart2.click();
		Thread.sleep(3000);
		increase.click();
		gotocart.click();
	}

}
