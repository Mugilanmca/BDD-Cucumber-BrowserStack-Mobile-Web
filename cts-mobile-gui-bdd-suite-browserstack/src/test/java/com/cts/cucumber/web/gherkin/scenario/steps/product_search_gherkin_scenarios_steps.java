package com.cts.cucumber.web.gherkin.scenario.steps;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.cucumber.app.android.steps.android_enrollment_and_login_steps;
import com.cts.cucumber.app.ios.steps.ios_product_search_steps;
import com.cts.cucumber.web.steps.web_product_search_steps;
import com.cts.cucumber.web.zpages.web_product_search_pages;
import com.cts.cucumber.zcommon_library.Reuable_Global_Common_library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.thucydides.core.annotations.Steps;

public class product_search_gherkin_scenarios_steps {
	
	@Steps
	web_product_search_steps webProductSearch;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(product_search_gherkin_scenarios_steps.class);
	  
	
	@When("I search the product in product list page")
	public void i_search_the_product_in_product_list_page() {
	  webProductSearch.serachProduct();
	}

	@Then("I am taken to product details page")
	public void i_am_taken_to_product_details_page() {
	    webProductSearch.verifyProduct();
	}

}
