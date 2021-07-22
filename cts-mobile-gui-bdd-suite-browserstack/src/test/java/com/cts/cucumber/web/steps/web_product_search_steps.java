package com.cts.cucumber.web.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.cucumber.app.android.zpages.android_enrollment_and_login_pages;
import com.cts.cucumber.app.ios.zpages.ios_product_search_pages;
import com.cts.cucumber.web.zpages.web_product_search_pages;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.thucydides.core.annotations.Step;

public class web_product_search_steps 
{
	web_product_search_pages webProductSearchPage;

	  private static final Logger LOGGER = LoggerFactory.getLogger(web_product_search_steps.class);
	

	  public void serachProduct() {
		webProductSearchPage.productSearchInHomeScreen();  
		LOGGER.info("Product Search successful");
	  }
	  
	  public void verifyProduct() {
		  webProductSearchPage.verifyProductInPDP();
			LOGGER.info("Product verified successful");
	  }
	  
	
	
}
