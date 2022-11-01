package com.BankingProject.Utilties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties Pro;
	
	public ReadConfig()
	{
		
		File src = new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			Pro = new Properties();
			Pro.load(fis);
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is"+ e.getMessage());
			
		}
	}
		
		public String getApplicationURL()
		{
			String url = Pro.getProperty("baseURL");
			return url;
		}
		
		public String getUsername()
		{
			String username = Pro.getProperty("username");
			return username;
		}
		
		public String getPassword()
		{
			String password = Pro.getProperty("password");
			return password;
		}
		
		public String getChromepath()
		{
			String chromepath = Pro.getProperty("chromepath");
			return chromepath;
		}
		
		public String getFirefoxpath()
		{
			String firefoxpath = Pro.getProperty("firefoxpath");
			return firefoxpath;
		}
	
	}


