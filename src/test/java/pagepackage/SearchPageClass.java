package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BiotiqueBaseClass;

public class SearchPageClass extends BiotiqueBaseClass {
	
	@FindBy(xpath="//*[@id=\"Search\"]")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header-custom\"]/div[1]/div/div/div[3]/div/predictive-search/form/button")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"product-grid\"]/ul/li[1]/form/div/div/a/img")
	WebElement moisturizer;
	
	@FindBy(xpath="//*[@data-icon=\"circle-xmark\"]")
	WebElement popupclose;
	
	@FindBy(xpath="//*[@id=\"shopify-section-template--18507821220078__ef580cb8-54f6-458a-b7d6-dd1210d5f127\"]/section[1]/div/div/div[1]/div[1]/button[2]")
	WebElement movetonext;
	
	public SearchPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void serachText()
	{
		search.sendKeys("moisturizer");
		searchbutton.click();
		moisturizer.click();
		popupclose.click();
		movetonext.click();
		movetonext.click();
		movetonext.click();
	}
	

}
