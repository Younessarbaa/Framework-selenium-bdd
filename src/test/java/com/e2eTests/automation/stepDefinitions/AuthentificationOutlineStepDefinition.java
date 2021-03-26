package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthentificationOutlinePage;
//import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.*;

public class AuthentificationOutlineStepDefinition {

	public WebDriver driver;
	private AuthentificationOutlinePage authentificationOutlinePage = new AuthentificationOutlinePage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public AuthentificationOutlineStepDefinition() {
		driver = Setup.driver;
	}
	
	
	@Given("^Je me connecte sur l application OrangeHRM$")
	public void je_me_connecte_sur_l_application_OrangeHRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		String url = "https://opensource-demo.orangehrmlive.com/";
//		driver.get(url);
//		Thread.sleep(3000);
		commonMethods.readFromConfigFile("url");
	}

	@When("^Je saisie le login \"([^\"]*)\"$")
	public void je_saisie_le_Admin(String User) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver,AuthentificationOutlinePage.class);
		authentificationOutlinePage.fillUserName(User);
	}

	
	@And("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void je_saisie_le_mot_de_passe_admin(String mdp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		authentificationOutlinePage.fillPassword(mdp);
	}

	@And("^je clique sur login$")
	public void je_clique_sur_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		authentificationOutlinePage.clickLoginButton();
	}

	
	@Then("^je verifie le message d erreur de la page connexion \"([^\"]*)\"$")
	public void je_verifie_le_message_d_erreur_de_la_page_connexion(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//PageFactory.initElements(driver, AuthentificationPage.class);
		//String text = AuthentificationOutlinePage.welcome.getText();
		//Assert.assertTrue(text.contains("Welcome"));
		String text = authentificationOutlinePage.fillMessage();
	//	System.out.println( "frrrrrrrrrrrrrrrr"+ text);
		Assert.assertTrue(text.contains(arg1));
	}

}
