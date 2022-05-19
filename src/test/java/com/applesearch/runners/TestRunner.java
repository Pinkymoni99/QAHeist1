package com.applesearch.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.applesearch.steps"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
