package com.cts.cucumber.web.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.cucumber.app.android.zpages.android_enrollment_and_login_pages;
import com.cts.cucumber.app.ios.zpages.ios_product_search_pages;
import com.cts.cucumber.web.zpages.web_enrollment_pages;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.thucydides.core.annotations.Step;

public class web_enrollment_steps 
{
	web_enrollment_pages webEnrollmentPages;

	  private static final Logger LOGGER = LoggerFactory.getLogger(web_enrollment_steps.class);
	
	  public void launchApplication() throws Exception {
	  webEnrollmentPages.launchWebApplication();
	  LOGGER.info("Application launch successful");
	  }
	
	
}
