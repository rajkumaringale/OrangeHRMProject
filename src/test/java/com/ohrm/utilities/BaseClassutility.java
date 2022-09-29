package com.ohrm.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.ohrm.pageobject.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassutility
{
	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getApplicationURL();
	String browser = readConfig.getChromePath();

	public String username = readConfig.getUsername() ;
	String password = readConfig.getPassword();
	
	
	public static WebDriver driver;
	public static Logger logger;



public void setup()
{

	//launch browser
	switch(browser.toLowerCase())
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;

	case "msedge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;

	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	default:
		driver = null;
		break;

	}
}	
		public void ClickByJS(WebElement element,WebDriver driver)
		{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",element);
		}
		public void scrollTillElementJS(WebElement ele, WebDriver driver)
		{	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
		}
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}
			 
			 public void TearDown()
				{
					driver.quit();
				//	driver.close();
				}
}
	
	
	

