package pagepackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.BiotiqueBaseClass;

public class AddToCartPageClass extends BiotiqueBaseClass  {
	
	@FindBy(xpath="//*[@id=\"product-grid\"]/form[1]/div/div/a/img")
	WebElement fruitfacewash;
	
	@FindBy(xpath="//*[@data-icon=\"circle-xmark\"]")
	WebElement popupclose;
	
	@FindBy(xpath="//select[@name=\"id\"]")
	WebElement dropdown;
	
	@FindBy(xpath="html/body/main/div[1]/section[1]/div/div/div[2]/form/div[4]/button")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/div[10]/div[1]/div[3]/div[1]/div/form/div/a")
	WebElement continueshopping;
	
	public AddToCartPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		fruitfacewash.click();
		Thread.sleep(2000);
		popupclose.click();
		Select qty=new Select(dropdown);
		qty.selectByVisibleText("200ml");
		js.executeScript("window.scrollBy(0,500)");
		popupclose.click();
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(2000);
		continueshopping.click();
}
}

