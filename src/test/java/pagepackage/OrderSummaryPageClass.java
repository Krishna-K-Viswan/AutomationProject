package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BiotiqueBaseClass;

public class OrderSummaryPageClass extends BiotiqueBaseClass{
	
	    @FindBy(xpath="//*[@id=\"CartSpecialInstructions\"]")
	    WebElement note;
	    
	    @FindBy(xpath="//*[@id=\"phone\"]")
	    WebElement phone;
	    
	    @FindBy(xpath="/html/body/main/div[1]/div/div/form/div/div[2]/div/div/div/div[5]/a")
	    WebElement checkout;
		
		public OrderSummaryPageClass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		 public void orderSummary()
		 {
			 note.sendKeys("I liked the products");
			 phone.sendKeys("7654321989");
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,500)");
			 checkout.click();
			 
		 }

}
