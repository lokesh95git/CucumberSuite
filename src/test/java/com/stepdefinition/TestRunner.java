package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/AddCustomerSuite.feature",
                 glue="com.stepdefinition",
                 plugin= {"html:target","json:target/report.json"},
                 dryRun=false,
                 tags={"@smoke"}
                 monochrome=true,
                 strict=true)
public class TestRunner {

}
