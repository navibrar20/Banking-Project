package com.BankingProject.TestCases;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BankingProject.PageObjects.LoginPage;

public class TestCase_LoginTest_001 extends BaseClass
{
	 @SuppressWarnings("deprecation")
	@Test
	 public void LoginTest() throws IOException, InterruptedException
	 {
		 
		 driver.get(baseURL);
		 logger.info("URL is opened");
		 
		 LoginPage lp = new LoginPage(driver);
		 lp.setUsername(username);
		 logger.info("Username is entered");
		 
		 lp.setPassword(password);
		 logger.info("Password is entered");
		 
		 lp.clicksubmit();
		 
		 System.out.println(driver.getTitle());
		 
		 if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		 {
			 
			 Assert.assertTrue(true);
			 logger.info("Test case is passed");
		 }
		 
		 else
		 {
			 capturescreen(driver, "LoginTest");
			 Assert.assertTrue(false);
			 logger.error("Test case is failed");
		 }
		 
		 
		
	 }
	 
	 

}
