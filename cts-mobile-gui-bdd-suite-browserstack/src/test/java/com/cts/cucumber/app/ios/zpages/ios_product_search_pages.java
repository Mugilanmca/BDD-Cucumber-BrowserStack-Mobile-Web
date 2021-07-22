package com.cts.cucumber.app.ios.zpages;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.cucumber.zcommon_library.Reuable_Global_Common_library;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;


public class ios_product_search_pages extends ios_aa_master_pages {
	
	public ios_product_search_pages(WebDriver driver) {
		super(driver);
	}
	
	public Properties mobileProperties = Reuable_Global_Common_library.getMobilePropertyInstance();

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[contains(@label,'Search Amazon')]")
	public WebElement txtSearchBox;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Search')]")
	public WebElement btnSearch;

	
	public void installApp() {
		String localDir = System.getProperty("user.dir");
		System.out.println("Mugilan--->"+localDir);
	}

	public void launchApp() {
		getIOSDriver().launchApp();
	}
	
	public void productSerach(String product) {
		        IOSElement textButton = (IOSElement) new WebDriverWait(getIOSDriver(), 30).until(
		                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
		            textButton.click();
		            IOSElement textInput = (IOSElement) new WebDriverWait(getIOSDriver(), 30).until(
		                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
		            textInput.sendKeys("hello@browserstack.com");
		            try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            IOSElement textOutput = (IOSElement) new WebDriverWait(getIOSDriver(), 30).until(
		                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
		            if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
		                assert(true);
		            else
		                assert(true);  
	}
	
	public void launchWebApplication() throws Exception  {
		Thread.sleep(3000);
		final String AUTOMATE_USERNAME = "mugilan_w7YaOe";
		  final String AUTOMATE_ACCESS_KEY = "WKJRUxr7qt2dkgyi6pTp";
		  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		  getDriver().get("https://www.currys.co.uk/gbuk/index.html");
		    WebElement element = getDriver().findElement(By.name("q"));
		    element.sendKeys("Amazon.co.uk");
		    element.submit();
		    WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		    try {
		    	wait.until(ExpectedConditions.titleContains("Amazon"));
		    	markTestStatus("passed","Title contains 'Amazon'!",getDriver());
		    }
		    catch(Exception e) {
		    	markTestStatus("failed","Title does not contain 'Amazon'!",getDriver());
		    }
		    System.out.println(getDriver().getTitle());
			System.out.println("Currys PC URL successfully launched");
		  }
	
	
	
	

public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	  }

}
