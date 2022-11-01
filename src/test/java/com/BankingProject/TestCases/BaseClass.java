package com.BankingProject.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.BankingProject.Utilties.ReadConfig;


public class BaseClass {
	
     ReadConfig readconfig = new ReadConfig();
	 public String baseURL = readconfig.getApplicationURL();
	 public String username = readconfig.getUsername();
	 public String password = readconfig.getPassword();
	 public static WebDriver driver;
	 
	 public static Logger logger;
	 
	 @BeforeClass
	 public void Setup()
	 {
		 System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		 driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 		
		 logger = Logger.getLogger("BaseClass");
		 PropertyConfigurator.configure("Log4j.Properties");
		 
	 }
	
	 @SuppressWarnings("deprecation")
	@AfterClass
	public void TearDown()
	{
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
		
	}
	 
	 public void capturescreen(WebDriver driver, String tname) throws IOException
	 {
		 TakesScreenshot ts =  (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
		 FileUtils.copyFile(source, target);
		 System.out.println("Screenshot Taken");
	
		 }
	
	
}
