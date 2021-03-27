package com.qa.stepdefinitions;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPage_StepDefinition extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^Check user able to access FreeCRM Site$")
	public void check_user_able_to_access_FreeCRM_Site(){
	 
		TestBase.intialization();
	}

	@When("^Check title page$")
	public void check_title_page(){
		loginpage = new LoginPage();
		String Title = loginpage.Login_getTitle();
		Assert.assertEquals(Title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}

	@Then("^Enter UserName and Password$")
	public void enter_UserName_and_Password(){
		
		homepage = loginpage.Login_validatecredential(prop.getProperty("UserName"),prop.getProperty("Password"));
	}

	@Then("^Check user landed in home page$")
	public void check_user_landed_in_home_page(){
		
		String Title = homepage.HomePage_VerifyTitle();
		Assert.assertEquals(Title, "CRMPRO");
	 
	}
	@Then("^Close the browser$")
	public void close_the_browser(){
		driver.quit();
	}


}
