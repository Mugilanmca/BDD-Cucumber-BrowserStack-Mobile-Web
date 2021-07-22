package com.cts.cucumber.app.android.zpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cts.cucumber.app.android.zpages.android_aa_MobilePageObject;
import com.google.common.base.Predicate;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;


public class android_aa_master_pages extends android_aa_MobilePageObject{

	public android_aa_master_pages(WebDriver driver) {
		super(driver);
	}
	
	public AndroidDriver getAndroidDriver() {
		return (((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()));
	}
	
	public WebDriver getWebDriver() {
		return (((WebDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()));
	}
	
	public void android_Swipe() {
		Dimension size = this.getAndroidDriver().manage().window().getSize();
		int startX = size.getWidth() / 2;
		int startY = size.getHeight() / 2;
		int endX = 0;
		int endY = (int) (startY * -1 * 0.75);
		TouchAction action = new TouchAction(getAndroidDriver());
		action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();

	}

	public void hideKeyBoard() throws MalformedURLException {
		((AndroidDriver<MobileElement>) getAndroidDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
}
