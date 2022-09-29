//package com.ohrm.testcases;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//import com.ohrm.pageobject.HomePage;
//import com.ohrm.pageobject.LoginPage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//@Test
//public class TC_HomePageTest
//{   
//	WebDriver driver;
//	@Test
//	public void LoginPageTC1() throws InterruptedException
//	{
//	
//	    WebDriverManager.chromiumdriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(5000);
//        
//        LoginPage lp = new LoginPage(driver);
//        lp.username("Admin");
//        lp.password("admin123");
//        lp.clickonloginbtn();
//        
//		HomePage hp = new HomePage(driver);
//		
//		hp.clickonuserdropdown();
//		hp.selectlogoutbtn(3);
//	    
//		
//	    
//}
//	
//}
//
//
//
