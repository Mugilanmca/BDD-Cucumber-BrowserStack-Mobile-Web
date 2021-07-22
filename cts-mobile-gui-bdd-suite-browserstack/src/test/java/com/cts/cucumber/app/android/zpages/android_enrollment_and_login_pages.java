package com.cts.cucumber.app.android.zpages;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cts.cucumber.zcommon_library.Reuable_Global_Common_library;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;


public class android_enrollment_and_login_pages extends android_aa_master_pages {
	
	public android_enrollment_and_login_pages(WebDriver driver) {
		super(driver);
	}
	
	public Properties mobileProperties = Reuable_Global_Common_library.getMobilePropertyInstance();

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'register_password')]")
	public WebElement txtPassword;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'register_confirm_password')]")
	public WebElement txtConfirmPassword;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'register_forename')]")
	public WebElement txtForeName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'register_surname')]")
	public WebElement txtSureName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'register_dob')]")
	public WebElement btnDOB;
	

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='01 January 2003']")
	public WebElement selectDOB;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	public WebElement btnOK;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'register_postcode')]")
	public WebElement txtPostCode;
	
	@AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@resource-id,'chk_agree')]")
	public WebElement btnAgree;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'btn_register')]")
	public WebElement btnRegister;
	
	
	public void installAndroidApp() {
		String localDir = System.getProperty("user.dir");
		System.out.println("Mugilan--->"+localDir);
	}

	public void launchAndroidApp() {
		getAndroidDriver().launchApp();
	}
	
	
	public void userNewSignIn() throws Exception {
		try {
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(10000);
		Thread.sleep(4000);
		getAndroidDriver().findElementById("register_email_address").sendKeys(rand_int1+"mugilanCTS@gmail.com");
		Thread.sleep(4000);
		typeInto(txtPassword,"Aadhav@123");
		txtConfirmPassword.sendKeys("Aadhav@123");
		android_Swipe();
		txtForeName.sendKeys("Mugilan");
		txtSureName.sendKeys("268172");
		btnDOB.click();
		selectDOB.click();
		btnOK.click();
		Thread.sleep(3000);
		android_Swipe(); 
		txtPostCode.sendKeys("G5 0RA");
		hideKeyBoard();
		Thread.sleep(3000);
		btnAgree.click();
//		hideKeyBoard();
//		android_Swipe();
//		btnRegister.click();
//		Thread.sleep(25000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void userNewBusinessSignIn() throws Exception {
		try {
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(10000);
		Thread.sleep(4000);
		getAndroidDriver().findElementById("register_email_address").sendKeys(rand_int1+"mugilanBusinessCTS@gmail.com");
		Thread.sleep(4000);
		typeInto(txtPassword,"Aadhav@123");
		txtConfirmPassword.sendKeys("Aadhav@123");
		android_Swipe();
		txtForeName.sendKeys("Mugilan");
		txtSureName.sendKeys("Business-268172");
		btnDOB.click();
		selectDOB.click();
		btnOK.click();
		Thread.sleep(3000);
		android_Swipe(); 
		txtPostCode.sendKeys("G5 0RA");
		hideKeyBoard();
		Thread.sleep(3000);
		btnAgree.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Timestamp getRandomTime(){
		String test;
		  Random r = new Random();
		  int Low = 100;
		  int High = 1500;
		  int Result = r.nextInt(High-Low) + Low;
		  int ResultSec = r.nextInt(High-Low) + Low;

		  Calendar calendar = Calendar.getInstance();
		  calendar.add(Calendar.MINUTE, - Result);
		  calendar.add(Calendar.SECOND, - ResultSec);

		  java.sql.Timestamp ts = new java.sql.Timestamp(calendar.getTimeInMillis());
		  return ts;
		}
}
