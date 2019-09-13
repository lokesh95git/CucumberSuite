package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
                 glue="com.stepdefinition",
                 plugin="html:target",
                 dryRun=false,
                 monochrome=true,
                 strict=true,
                 tags={"@regression","@smoke"})
public class TestRunner {

}
