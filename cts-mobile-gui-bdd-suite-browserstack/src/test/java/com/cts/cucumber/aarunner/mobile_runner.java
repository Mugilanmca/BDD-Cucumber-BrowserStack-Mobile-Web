 package com.cts.cucumber.aarunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = {"@testmugi2"},
        glue = {"com.cts"})
public class mobile_runner {

}

