package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;      

public class AuthentificationPage {
	
	final static String USER_NAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword1";
	final static String BUTTON_LOGIN = "btnLogin";
	
	
	/* @FindBy */
	@FindBy(how = How.ID ,using = USER_NAME_ID)
	public static WebElement userName;
	
	@FindBy(how = How.ID ,using = PASSWORD_ID)
	public static WebElement password;
	
	@FindBy(how = How.ID ,using = BUTTON_LOGIN)
	public static WebElement btnLogin;
	
	/* Method */
	public void fillUserName() {
		userName.sendKeys("Admin");
	}
	
	public void fillPassword() {
		password.sendKeys("admin123");
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	

}
