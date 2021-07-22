package com.cts.cucumber.zcommon_library;

import java.io.File;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.DriverSource;

public class WebAndMobileDriverFactory implements DriverSource {
	private static Properties mobileProperties;
	private static Properties globalProperties;
	public static URL url;
	public static DesiredCapabilities capabilities;
	String localDir = System.getProperty("user.dir");

	@Override
	public WebDriver newDriver() {
		try {
			System.setProperty("http.nonProxyHosts", "0.0.0.*|localhost*|127.0.0.1|10.207.209.36*|172.30.57.118*‌");
			System.setProperty("http.proxyHost", "");
			System.setProperty("socksProxyHost", "");
			System.setProperty("socksProxyPort", "");

			mobileProperties = Reuable_Global_Common_library.getMobilePropertyInstance();
			globalProperties = Reuable_Global_Common_library.getGlobalPropertyInstance();
			String strPlatform = globalProperties.getProperty("Execution_platform");
			WebDriver driver = null;
			DesiredCapabilities capabilities = new DesiredCapabilities();
			switch (strPlatform) {
			case "android_native":
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
						mobileProperties.getProperty("am_udid").trim());
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
				capabilities.setCapability("appPackage", mobileProperties.getProperty("Application_Package_Name"));
				capabilities.setCapability("appActivity",
						mobileProperties.getProperty("Application_MainActivity_Name"));
				capabilities.setCapability("app", mobileProperties.getProperty("Android_Application_Path"));
				capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
				capabilities.setCapability(MobileCapabilityType.UDID, mobileProperties.getProperty("am_udid").trim());
				driver = new AndroidDriver(new URL(mobileProperties.getProperty("AppiumURL")), capabilities);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				break;

			case "browserStack_android":
				capabilities.setCapability("browserstack.user", globalProperties.getProperty("BrowserStack_user"));
				capabilities.setCapability("browserstack.key", globalProperties.getProperty("BrowserStack_key"));
				capabilities.setCapability("app",  globalProperties.getProperty("BrowserStack_App_Android").trim());
				capabilities.setCapability("device",  globalProperties.getProperty("BrowserStack_android_device").trim());
				capabilities.setCapability("os_version",  globalProperties.getProperty("BrowserStack_android_OS").trim());
				capabilities.setCapability("appPackage", mobileProperties.getProperty("Application_Package_Name"));
				capabilities.setCapability("appActivity",
						mobileProperties.getProperty("Application_MainActivity_Name"));
				capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
				capabilities.setCapability("name", "Mugilan - CYBG-Android -Native Testing in Browser Stack"); 
				driver = new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
				break;
				
			case "ios_native":
				capabilities.setCapability("browserstack.user",
						globalProperties.getProperty("BrowserStack_user").trim());
				capabilities.setCapability("browserstack.key", globalProperties.getProperty("BrowserStack_key").trim());
				capabilities.setCapability("app",  globalProperties.getProperty("BrowserStack_App_iOS").trim());
				capabilities.setCapability("device",  globalProperties.getProperty("BrowserStack_iOS_device").trim());
				capabilities.setCapability("os_version",  globalProperties.getProperty("BrowserStack_iOS_OS").trim());
				capabilities.setCapability("build", "Mugilan - CYBG- iOS - Hybrid app Testing in Browser Stack");
				driver = new IOSDriver<IOSElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), capabilities);
				break;

			case "mac_chrome":
				final String AUTOMATE_USERNAME = globalProperties.getProperty("BrowserStack_user");
				final String AUTOMATE_ACCESS_KEY = globalProperties.getProperty("BrowserStack_key");
				final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
						+ "@hub-cloud.browserstack.com/wd/hub";
							capabilities.setCapability("name", "Desktop - Mac Browser Testing in Browser Stack"); 
							capabilities.setCapability("browser", globalProperties.getProperty("BrowserStack_browser"));
							capabilities.setCapability("browser_version", globalProperties.getProperty("BrowserStack_browser_version"));
							capabilities.setCapability("os", globalProperties.getProperty("BrowserStack_Desktop_mac_os"));
							capabilities.setCapability("os_version", globalProperties.getProperty("BrowserStack_Desktop_mac_os_version"));
				driver = new RemoteWebDriver(new URL(URL), capabilities);
				break;
				
			case "windows_chrome":
				break;

			default:

				break;

			}
			return driver;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return false;
	}

}
