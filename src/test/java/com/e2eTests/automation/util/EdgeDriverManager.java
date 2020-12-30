package com.e2eTests.automation.util;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {
	
	@Override
	protected void startService() {
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\Drivers\\msedgedriver.exe");
	}
	
	@Override 
	protected void stopService() {
		    
	}
	
	@Override
	protected void createDriver() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

}
