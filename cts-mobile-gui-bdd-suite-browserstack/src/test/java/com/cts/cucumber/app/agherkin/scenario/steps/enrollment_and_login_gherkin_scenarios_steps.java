package com.cts.cucumber.app.agherkin.scenario.steps;

import java.util.Properties;

import com.cts.cucumber.app.android.steps.android_enrollment_and_login_steps;
import com.cts.cucumber.app.ios.steps.ios_product_search_steps;
import com.cts.cucumber.zcommon_library.Reuable_Global_Common_library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.thucydides.core.annotations.Steps;

public class enrollment_and_login_gherkin_scenarios_steps  
{
	private static Properties mobileProperties =  Reuable_Global_Common_library.getMobilePropertyInstance();
	private static Properties globalProperties = Reuable_Global_Common_library.getGlobalPropertyInstance();
	String strPlatform = globalProperties.getProperty("Execution_platform");
	boolean ANDROID = false, IOS = false;
	
	@Steps
	android_enrollment_and_login_steps android_Enrollment_Steps;
	
	@Steps
	ios_product_search_steps ios_ios_product_search_steps;

	public enrollment_and_login_gherkin_scenarios_steps() {
		if (strPlatform.contains("android")) {
			ANDROID = true;
		}else {
			IOS= true;
		}
	}
	@Given("I am enrolled as a new user")
	public void i_am_enrolled_as_a_new_user() throws Exception {
		if(ANDROID) {
			android_Enrollment_Steps.installAndLaunchApp();
			android_Enrollment_Steps.newUSerEnrollment();
		}else if (IOS) {
			System.out.println("Mugilan iOS is running");
		}
	}
	
	@Given("I am enrolled as a new BUsiness user")
	public void i_am_enrolled_as_a_new_BUsiness_user() throws Exception{
		if(ANDROID) {
			android_Enrollment_Steps.installAndLaunchApp();
			android_Enrollment_Steps.newBusinessUSerEnrollment();
		}else if (IOS) {
			System.out.println("Mugilan iOS is running");
		}
	}

	@When("I login with valid user credentials")
	public void i_login_with_valid_user_credentials() {
	   
	}

	@Then("I am taken to the home screen")
	public void i_am_taken_to_the_home_screen() {
	   
	}
	
	@Given("I am login as a guest user and launch the app")
	public void i_am_login_as_a_guest_user_and_launch_the_app() {
		if(ANDROID) {
			
		}else if (IOS) {
			ios_ios_product_search_steps.installAndLaunchiOSApp();
		}
	}
}
