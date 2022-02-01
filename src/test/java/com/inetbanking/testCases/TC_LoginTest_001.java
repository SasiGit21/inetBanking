package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		
		driver.get(baseURL);
		logger.info("URL is opened");
		Thread.sleep(1000);
		LoginPage lp=new LoginPage(driver);
//		WebElement frame1 = driver.findElement(By.id("ccpa-consent-notice"));
//		driver.switchTo().frame(frame1);
//		driver.findElement(By.id("saveAndExit")).click();
		lp.setUserName(username);
		logger.info("Entered username");
	
		lp.setPassword(password);
		logger.info("Enter the password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			//captureScreen(driver,"LoginTest");
			Assert.assertTrue(true);
			logger.info("Logger test passed");
		}
		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Logger test failed");
		}
	}
	
}
