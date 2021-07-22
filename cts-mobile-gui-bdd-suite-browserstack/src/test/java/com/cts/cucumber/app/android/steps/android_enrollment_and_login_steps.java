package com.cts.cucumber.app.android.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.cucumber.app.android.zpages.android_enrollment_and_login_pages;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.thucydides.core.annotations.Step;

public class android_enrollment_and_login_steps 
{
	android_enrollment_and_login_pages androidEnrollmentAndLoginPage;

	  private static final Logger LOGGER = LoggerFactory.getLogger(android_enrollment_and_login_steps.class);
	
	@Step
	public void installAndLaunchApp() {
		androidEnrollmentAndLoginPage.installAndroidApp();
		LOGGER.info("Installation successful");
		androidEnrollmentAndLoginPage.launchAndroidApp();
		LOGGER.info("Launch the app successful");
	}
	
	public void newUSerEnrollment() throws Exception {
		androidEnrollmentAndLoginPage.userNewSignIn();
	}
	
	public void newBusinessUSerEnrollment() throws Exception {
		androidEnrollmentAndLoginPage.userNewBusinessSignIn();
	}
}
