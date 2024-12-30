package testpackage;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.BiotiqueBaseClass;
import pagepackage.AddToCartPageClass;
import pagepackage.CreateAccountPageClass;
import pagepackage.GoToCartPageClass;
import pagepackage.HairMouseHoverPageClass;
import pagepackage.LoginPageClass;
import pagepackage.OrderSummaryPageClass;
import pagepackage.ScreenshotPageClass;
import pagepackage.SearchPageClass;
import pagepackage.SignInPageClass;
import pagepackage.SkinMouseHoverPageClass;
import pagepackage.TitleVerificationPageClass;
import pagepackage.WishlistPageClass;

public class BiotiqueTestClass extends BiotiqueBaseClass {
	
	@Test 
	public void biotiqueTest() throws InterruptedException, IOException
	{
		
		TitleVerificationPageClass tv=new TitleVerificationPageClass(driver);
		tv.titleVerification(); 
		Thread.sleep(1000);
		
		ScreenshotPageClass ss=new ScreenshotPageClass(driver);
		ss.screenShot();
		Thread.sleep(1000);
		 
		LoginPageClass lp=new LoginPageClass(driver);
		lp.login(); 
		Thread.sleep(2000);
		 
		CreateAccountPageClass ca=new CreateAccountPageClass(driver);
		ca.createAccount(); 
		Thread.sleep(2000);
		 
		SignInPageClass sp=new SignInPageClass(driver);
		sp.signIn();
		Thread.sleep(2000);
		
		SearchPageClass pc=new SearchPageClass(driver);
		pc.serachText();
		Thread.sleep(2000);
		 
		SkinMouseHoverPageClass mh=new SkinMouseHoverPageClass(driver);
	    mh.skinMouseHover();
		Thread.sleep(3000);
	    
		AddToCartPageClass ap=new AddToCartPageClass(driver);
		ap.addToCart();
		Thread.sleep(3000);
		
		WishlistPageClass wp=new WishlistPageClass(driver);
		wp.wishList();
		Thread.sleep(3000);
		 
		HairMouseHoverPageClass hm=new HairMouseHoverPageClass(driver);
		hm.hairMouseHover();
		Thread.sleep(3000);
		
		GoToCartPageClass gc=new GoToCartPageClass(driver);
		gc.goToCart();
		Thread.sleep(3000);
		
		OrderSummaryPageClass os=new OrderSummaryPageClass(driver);
		os.orderSummary();
		Thread.sleep(3000);
	}
	
}
