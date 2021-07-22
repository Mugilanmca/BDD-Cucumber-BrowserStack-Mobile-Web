package com.cts.cucumber.web.zpages;

import java.net.URL;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.cucumber.zcommon_library.Reuable_Global_Common_library;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;


public class web_product_search_pages extends web_aa_master_pages {
	
	public web_product_search_pages(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(id = "search_query_top")
	public WebElement txtSearchBox;
	
	@FindBy(name = "submit_search")
	public WebElement btnSearch;
	
	@FindBy(xpath = "(//div[@class='product-image-container'])[1]")
	public WebElement lnkFirstProduct;

	@FindBy(xpath = "//button[contains(text(), 'Accept')]")
	public WebElement btnAcceptAllCookies;
	
	@FindBy(xpath = "//h1[contains(text(),'Printed')]")
	public WebElement lnkVerifyProductTitle;
	
	
	public void productSearchInHomeScreen() {
		try {
			Thread.sleep(2000);
//			if (btnAcceptAllCookies.isDisplayed())
//				clickOn(btnAcceptAllCookies);
			  typeInto(txtSearchBox,"Dress");
			  clickOn(btnSearch);
			  
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 typeInto(txtSearchBox,"MacBook Pro");
			  clickOn(btnSearch);
		}
	
	}
	
	public void verifyProductInPDP(){
		  try {
		Thread.sleep(2000);
		clickOn(lnkFirstProduct);
	    WebDriverWait wait = new WebDriverWait(getDriver(), 5);
	    	wait.until(ExpectedConditions.visibilityOf(lnkVerifyProductTitle));
	    	markTestStatus("passed","Successfully navigated to Product Details Page",getDriver());
	    }
	    catch(Exception e) {
	    	markTestStatus("failed","Not able to navigate to Product Details page",getDriver());
	    }
		System.out.println("Product Search Successfully");
	  }
	

public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	  }

}
