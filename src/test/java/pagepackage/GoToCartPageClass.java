package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BiotiqueBaseClass;

public class GoToCartPageClass extends BiotiqueBaseClass {
	
	//@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/div[1]/div/div/div[5]/ul/li[4]/a/img")
	//WebElement cart;

	@FindBy(xpath="//*[@id=\"cart_items_count\"]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"cart\"]/div/div[1]/div[2]/div/div/div[4]/div/div/span[1]/i")
	WebElement minus;
	
	@FindBy(xpath="//*[@id=\"cart\"]/div/div[1]/div[2]/div/div/div[1]")
	WebElement delete;
	
	public GoToCartPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToCart() throws InterruptedException
	{
		cart.click();
		Thread.sleep(3000);
		minus.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
	}

}
