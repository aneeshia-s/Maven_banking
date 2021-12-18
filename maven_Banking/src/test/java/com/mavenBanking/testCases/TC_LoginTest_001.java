package com.mavenBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mavenBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException
	{
			
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPasssword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
	
}
