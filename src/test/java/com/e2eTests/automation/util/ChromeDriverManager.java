package com.e2eTests.automation.util;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {
	
	private ChromeDriverService chService;
	
	@Override
	public void startService() {
		
	if(null == chService) {
		try {
			chService = new ChromeDriverService.Builder()
												.usingDriverExecutable(new File("src/test/resources/Drivers/chromedriver.exe"))
												.usingAnyFreePort().build();
			chService.start();
		} catch(Exception e) {
			e.printStackTrace();
		}			
		}
	 	}

	@Override
	public void stopService(){
		if (null != chService && chService.isRunning())
			chService.stop();
	}
	
	@Override
	public void createDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("test-type");
		// options.addArguments("--disable-extension-true");
		// options.addArguments("--disablenotifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(chService,capabilities);
		
		
		//driver = new ChromeDriver(chService);
		driver.manage().window().maximize();
		 
	}
}
