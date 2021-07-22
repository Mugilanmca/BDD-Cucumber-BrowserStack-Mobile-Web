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


public class web_enrollment_pages extends web_aa_master_pages {
	
	public web_enrollment_pages(WebDriver driver) {
		super(driver);
	}
	
	public Properties mobileProperties = Reuable_Global_Common_library.getMobilePropertyInstance();

	@FindBy(name = "search-field")
	public WebElement txtSearchBox;
	
	@FindBy(xpath = "(//button[contains (text(),'Search')])[2]")
	public WebElement btnSearch;
	
	@FindBy(xpath = "(//div[@class='productListImage'])[1]")
	public WebElement lnkFirstProduct;

	@FindBy(id="username")
	public  WebElement loginusername;
	
	@FindBy(id="password")
	public  WebElement loginpwd;
	
	@FindBy(id="_submit")
	public  WebElement loginsubmitbtn;
	
	
//	public void launchWebApplication_update() throws Exception  {
//		Thread.sleep(3000);
//		final String AUTOMATE_USERNAME = "mugilan_w7YaOe";
//		  final String AUTOMATE_ACCESS_KEY = "WKJRUxr7qt2dkgyi6pTp";
//		  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
//		  getDriver().get("https://www.currys.co.uk/gbuk/index.html");
//		    WebElement element = getDriver().findElement(By.name("q"));
//		    element.sendKeys("Amazon.co.uk");
//		    element.submit();
//		    WebDriverWait wait = new WebDriverWait(getDriver(), 5);
//		    try {
//		    	wait.until(ExpectedConditions.titleContains("Amazon"));
//		    	markTestStatus("passed","Title contains 'Amazon'!",getDriver());
//		    }
//		    catch(Exception e) {
//		    	markTestStatus("failed","Title does not contain 'Amazon'!",getDriver());
//		    }
//		    System.out.println(getDriver().getTitle());
//			System.out.println("Currys PC URL successfully launched");
//		  }
//	
	
	public void launchWebApplication() throws Exception  {
		Thread.sleep(3000);
		  getDriver().get("http://automationpractice.com/");
		//  typeInto(loginusername,"test@curatorsolutions.com");
		//  typeInto(loginpwd,"Test$Pwd123");
		//  clickOn(loginsubmitbtn);
		  }
	
	

public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	  }

}
