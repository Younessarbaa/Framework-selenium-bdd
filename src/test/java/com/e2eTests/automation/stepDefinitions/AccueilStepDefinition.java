 package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AccueilPage;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinition {
	
	public WebDriver driver;
	private AccueilPage accueilPage = new AccueilPage();
	public AccueilStepDefinition() {
		driver = Setup.driver;
	}
	
	@When("^je clique sur le module Recruitment$")
	public void je_clique_sur_le_module_Recruitment() throws Throwable {
		PageFactory.initElements(driver, AccueilPage.class);
		accueilPage.goToRecruitment();
	}

	@Then("^je verifie l affichage de la page Recruitment$")
	public void je_verifie_l_affichage_de_la_page_Recruitment() throws Throwable {
		String pageRecruitment = AccueilPage.pageRecruitment.getText();
		Assert.assertTrue(pageRecruitment.contains("Candidates"));
	}

	@When("^je clique sur le module PIM$")
	public void je_clique_sur_le_module_PIM() throws Throwable {
		accueilPage.goToPIM();
	}

	@Then("^je verifie l affichage de la page PIM$")
	public void je_verifie_l_affichage_de_la_page_PIM() throws Throwable {
		String pagePIM = AccueilPage.pagePIM.getText();
		Assert.assertTrue(pagePIM.contains("Configuration"));
	}

}
