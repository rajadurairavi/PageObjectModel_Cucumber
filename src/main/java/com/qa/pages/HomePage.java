package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath ="//td[contains(text(),'User: Raj Kamal Thanikachalam')]")
	WebElement userID ;
	
	@FindBy(xpath ="//a[contains(text(),'Contact')]")
	WebElement contact;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String HomePage_VerifyTitle(){
		return driver.getTitle();
	}
	
	public boolean HomePage_ValidateUser(){
		return  userID.isDisplayed();
	}
	
}
