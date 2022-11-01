package com.BankingProject.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver)
	{
		
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement uid;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//div[@id = 'navbar-brand-centered']/ul/li[1]/a")
	@CacheLookup
	WebElement Selenium;
	
	
	public void setUsername(String uname)
	{
		
		uid.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		
		password.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btnLogin.click();
	}
	
	public void Selectdropdown()
	{
		Selenium.click();
	}
}
