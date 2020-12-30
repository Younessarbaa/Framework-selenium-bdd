package com.e2eTests.automation.util;


public class InternetExplorerDriver extends DriverManager {

	@Override
	protected void startService() {
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\Drivers\\msedgedriver.exe");
	}

	@Override
	protected void stopService() {

	}

	@Override
	protected void createDriver() {
		// driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

}
