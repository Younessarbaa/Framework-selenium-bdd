package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition  extends CommonMethods {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	
	public AuthentificationStepDefinition()  {
		driver = Setup.driver;
	}
	
	@Given("^J Ouvre l application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		String url = "https://opensource-demo.orangehrmlive.com/";
//		driver.get(url);
//		Thread.sleep(3000);
		logger.info("J Ouvre l application OrangeHRM");
		commonMethods.readFromConfigFile("url");
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver,AuthentificationPage.class);
		logger.info("Je saisie le login");
		authentificationPage.fillUserName();
	}

	@And("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   logger.info("Je saisie le mot de passe");
	   authentificationPage.fillPassword();
	}

	@And("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logger.info("Je clique sur le boutton login");
		authentificationPage.clickLoginButton();
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Succesfully login");
		logger.info("Je verfie le compte admin");
		String text = AuthentificationPage.welcome.getText();
		Assert.assertTrue(text.contains("Welcome"));
	}

}
