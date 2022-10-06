package com.qa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo
{
	public static void main(String[]args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Documents\\kunal\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		File desc=new File("C:\\Users\\Admin\\OneDrive\\Documents\\kunal\\Amazon.png");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileHandler.copy(src,desc);
	
	}

}

