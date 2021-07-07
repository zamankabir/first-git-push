package com.seleniumamazon;

import org.openqa.selenium.By;                   //facebook--project name------ group_a
import org.openqa.selenium.WebDriver;           //  orangreHrm--- project name "smarttech_zamankabir".
import org.openqa.selenium.chrome.ChromeDriver; // amazon------- project name "test_new" smarttech_zamankabir

public class AmazonWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	     
		 
		 System.setProperty("webdriver.chrome.driver",
	      "C:\\Driver\\chromedriver.exe");
	
		 WebDriver driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters 
		 
	      
	      String url = "https://www.amazon.com";
	      driver.get(url);	

driver.findElement(By.name("email")).sendKeys("Zamankabir@yahoo.com");
driver.findElement(By.name("password")).sendKeys("Tanishatayma1");
		
	}

}
