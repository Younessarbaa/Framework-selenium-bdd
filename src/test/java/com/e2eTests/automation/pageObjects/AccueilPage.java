 package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccueilPage {

	final static String BUTTON_RECRUITMENT = "menu_recruitment_viewRecruitmentModule";
	final static String PAGE_RECRUITMENT = "menu_recruitment_viewCandidates";
	final static String BUTTON_PIM = "menu_pim_viewPimModule";
	final static String PAGE_PIM = "menu_pim_Configuration";

	/* @FindBy */
	@FindBy(how = How.ID ,using = BUTTON_RECRUITMENT)
	public static WebElement btnRecruitment;
	
	@FindBy(how = How.ID ,using = PAGE_RECRUITMENT)
	public static WebElement pageRecruitment;
	
	@FindBy(how = How.ID ,using = BUTTON_PIM)
	public static WebElement btnPIM;
	
	@FindBy(how = How.ID ,using = PAGE_PIM)
	public static WebElement pagePIM;
	

	/* Method */
	public void goToRecruitment() {
		btnRecruitment.click();
	}
	
	public void goToPIM() {
		btnPIM.click();
	} 
}
