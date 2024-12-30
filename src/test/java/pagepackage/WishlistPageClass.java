package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basepackage.BiotiqueBaseClass;

public class WishlistPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"Search\"]")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/div[1]/div/div/div[3]/div/predictive-search/form/button")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"product-grid\"]/ul/li[1]/form/div/div/button")
	WebElement wishlisticon;
	
	@FindBy(xpath="/html/body/div[9]/div[1]/div[2]/div/div[4]/div/div/div[2]/div[1]/div[2]/span")
	WebElement remove;
	
	@FindBy(xpath="/html/body/div[9]/div[1]/div[1]/div/div/span")
	WebElement close;
	
	public WishlistPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void wishList() throws InterruptedException
	{
		search.sendKeys("Toner");	
		searchbutton.click();
		wishlisticon.click();
		Thread.sleep(3000);
		remove.click();
		Thread.sleep(3000);
		close.click();
		search.clear();
		search.sendKeys("Toner");	
		searchbutton.click();
		wishlisticon.click();
		Thread.sleep(3000);
		close.click();
	}
	

}
