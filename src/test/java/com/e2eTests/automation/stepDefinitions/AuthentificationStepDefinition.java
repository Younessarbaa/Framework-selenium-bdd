package com.e2eTests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.Setup;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}
	
	@Given("^J Ouvre l application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		Thread.sleep(3000);
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver,AuthentificationPage.class);
		authentificationPage.fillUserName();
	}

	@And("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   authentificationPage.fillPassword();
	}

	@And("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		authentificationPage.clickLoginButton();
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Succesfully login");
	}

}
