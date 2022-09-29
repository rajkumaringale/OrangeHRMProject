package com.ohrm.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ohrm.pageobject.LoginPage;
import com.ohrm.pageobject.PIMPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AddEmployeepimTest 
{ 
	WebDriver driver;

 @Test()
 public void addEmployee()
 {      WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage pg = new LoginPage(driver);
		pg.getUsername("Admin");
		pg.getPassword("admin123");
		pg.clickonloginbtn();
	 
	 PIMPage pimpg  = new PIMPage(driver);
	 pimpg.clickonPIM();
	 pimpg.clickonaddEmployee();
	 pimpg.enterempFirstname("Raj");
	 pimpg.enterempMidname("King");
	 pimpg.enterlastname("Leo");
	 pimpg.enteremployeeid("2022");
	 
     driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).sendKeys("C:\\Images\\Cartoon-DP-Boy.jpg");
	 pimpg.clickonsaveButton();
	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	WebElement we = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
	we.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement log = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
    log.click();
	
	
	
 }
 
}
