package com.cts.cucumber.web.gherkin.scenario.steps;

import java.util.Properties;

import com.cts.cucumber.app.android.steps.android_enrollment_and_login_steps;
import com.cts.cucumber.app.ios.steps.ios_product_search_steps;
import com.cts.cucumber.web.steps.web_enrollment_steps;
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
	
	@Steps
	web_enrollment_steps webEnrollment;
	
	
	@Given("I am able to launch the URL in mac desktop chrome browser")
	public void i_am_able_to_launch_the_URL_in_mac_desktop_chrome_browser() throws Exception {
		webEnrollment.launchApplication();
	}

	
}
