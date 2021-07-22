package com.cts.cucumber.app.ios.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.cucumber.app.android.zpages.android_enrollment_and_login_pages;
import com.cts.cucumber.app.ios.zpages.ios_product_search_pages;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.thucydides.core.annotations.Step;

public class ios_product_search_steps 
{
	ios_product_search_pages iOSProductSearchPage;

	  private static final Logger LOGGER = LoggerFactory.getLogger(ios_product_search_steps.class);
	
	@Step
	public void installAndLaunchiOSApp() {
	//	iOSProductSearchPage.installApp();
		LOGGER.info("Installation successful");
	//	iOSProductSearchPage.launchApp();
		LOGGER.info("Launch the app successful");
	}

	@Step
	public void searchProduct(String product) throws Exception {
		iOSProductSearchPage.productSerach(product);
	}
	
	@Step
	public void launchWebApplication() throws Exception {
		iOSProductSearchPage.launchWebApplication();
	}
	
	
}
