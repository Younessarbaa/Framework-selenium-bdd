package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationOutlinePage {

	final static String USER_NAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN = "btnLogin";
	final static String MESSAGE_ID  =  "welcome";
	final static String ERREUR_ID  = "spanMessage";
	
	/* @FindBy */
	@FindBy(how = How.ID ,using = USER_NAME_ID)
	public static WebElement userName;
	
	@FindBy(how = How.ID ,using = PASSWORD_ID)
	public static WebElement password;
	
	@FindBy(how = How.ID ,using = BUTTON_LOGIN)
	public static WebElement btnLogin;
	
	@FindBy(how = How.ID ,using = MESSAGE_ID)
	public static WebElement welcome;
	
	@FindBy(how = How.ID, using = ERREUR_ID)
	public static WebElement erreur;
	
	/* Method */
	public void fillUserName(String User) {
		userName.sendKeys(User);
	}
	
	public void fillPassword(String mdp) {
		password.sendKeys(mdp);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	public String fillMessage() {
		return erreur.getText();
	}

	public String validAccess() { return welcome.getText();}
}
