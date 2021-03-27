package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

@FindBy(name = "username")
WebElement userName;

@FindBy(name = "password")
WebElement password;

@FindBy(xpath = "//input[@type='submit']")
WebElement loginButton;

@FindBy(xpath = "//img[@src ='https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg']")
WebElement logo;
	
//To initialize the web element stored under Page Factory
	public LoginPage(){
		PageFactory.initElements(driver, this);   
	}	

	//Actions
	public String Login_getTitle(){
		return driver.getTitle();
	}
	
	public boolean Login_getimage(){
		return logo.isDisplayed();
	}
	
	public HomePage Login_validatecredential(String Username, String Password){
		userName.sendKeys(Username);
		password.sendKeys(Password);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);
		return new HomePage();  //Landing page, hence we return the next class 
		
	}

}
