package com.ohrm.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ohrm.pageobject.LoginPage;
import com.ohrm.utilities.BaseClassutility;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC_LoginPageTest  extends BaseClassutility
{
	WebDriver driver;

	@Test
	public void LoginPageTest()
	{   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage pg = new LoginPage(driver);
		pg.getUsername("Admin");
		pg.getPassword("admin123");
		pg.clickonloginbtn();
   }
	@Test
	public void verifyPageTitleTest()
	{
		String pgtitle = driver.getTitle();
		System.out.println("PageTitle --> "+pgtitle);
		Assert.assertEquals(pgtitle, "OrangeHRM");
	    
	}
	@Test
	public void verifyPageUrlTest() 
	{
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URL--> "+currenturl);
		
	}
	
	}
	




