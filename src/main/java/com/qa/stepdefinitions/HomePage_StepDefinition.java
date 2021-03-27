/*package com.qa.stepdefinitions;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage_StepDefinition extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	
	
	@Given("^Check user able to access FreeCRM Site$")
	public void check_user_able_to_access_FreeCRM_Site(){
	   TestBase.intialization();
	}

	@When("^Check title page$")
	public void check_title_page(){
		loginPage.Login_getTitle();
	    
	}

	@Then("^Enter UserName and Password$")
	public void enter_UserName_and_Password(){
		loginPage.Login_validatecredential("008rajkamal", "Feb$2018@");
	}

	@Then("^Check user landed in home page$")
	public void check_user_landed_in_home_page(){
	   
	}

}
*/