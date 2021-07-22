package com.cts.cucumber.app.agherkin.scenario.steps;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

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

public class product_search_gherkin_scenarios_steps {
	private static Properties mobileProperties = Reuable_Global_Common_library.getMobilePropertyInstance();
	private static Properties globalProperties = Reuable_Global_Common_library.getGlobalPropertyInstance();
	String strPlatform = globalProperties.getProperty("Execution_platform");
	boolean ANDROID = false, IOS = false;

	@Steps
	android_enrollment_and_login_steps android_Enrollment_Steps;

	@Steps
	ios_product_search_steps ios_ios_product_search_steps;

	public product_search_gherkin_scenarios_steps() {
		if (strPlatform.contains("android")) {
			ANDROID = true;
		} else {
			IOS = true;
		}
	}

	@When("I search for the {string} in home screen")
	public void i_search_for_the_in_home_screen(String product) throws Exception {
		if (ANDROID) {

		} else if (IOS) {
			ios_ios_product_search_steps.searchProduct(product);
			System.out.println("Mugilan iOS is running");
		}
	}

	@Then("I am able to navigate to Product list page with the product")
	public void i_am_able_to_navigate_to_Product_list_page_with_the_product() {
		if (ANDROID) {

		} else if (IOS) {
			System.out.println("Mugilan iOS is running");
		}
	}

	@Given("I am able to launch the URL in iOS mobile chrome browser")
	public void i_am_able_to_launch_the_URL_in_iOS_mobile_chrome_browser() throws Exception {
		if (ANDROID) {

		} else if (IOS) {
				ios_ios_product_search_steps.launchWebApplication();
			
		}
	}

}
