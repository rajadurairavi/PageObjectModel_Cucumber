package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false, 
		features = "C:/Automation/PageObjectModel_Cucumber/src/main/java/com/qa/features/FreeCRM.feature",	
		glue={"com/qa/stepdefinitions"}, 
		plugin = {"pretty", "html:test-output","junit:junitOutput/junit.xml"}, 
		monochrome = true,
		strict = true 
		
		)

public class LoginPage_Runner {

}
