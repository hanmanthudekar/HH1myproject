package com.qa;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample 
{
	public static void main(String[]args) throws Exception
	
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Documents\\kunal\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	File dec =new File("C:\\Users\\Admin\\OneDrive\\Documents\\kunal\\SC.png");
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,dec); 
	System.out.println("Screenshot Capchured");
	
	}

}
