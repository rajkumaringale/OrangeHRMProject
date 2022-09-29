package com.ohrm.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage 
{   public WebDriver driver;
	public PIMPage(WebDriver rdriver)
	  {
		driver= rdriver;
		PageFactory.initElements(rdriver, this);
	  }
	@FindBy(css="a[class='oxd-main-menu-item active'] span[class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    WebElement selpim;
	@FindBy(xpath="//a[normalize-space()='Add Employee']")
	WebElement addemp;
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement empfirstnm;
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	WebElement midname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lstname;
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement addempid;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement savbtn;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutt;
	public void clickonPIM()
	{
		selpim.click();
	}
	public void clickonaddEmployee()
	{
		addemp.click();
	}
	public void enterempFirstname(String fname)
	{
		empfirstnm.sendKeys(fname);
	}
	public void enterempMidname(String midnam)
	{
		midname.sendKeys(midnam);
	}
	public void enterlastname(String lstnam)
	{
		lstname.sendKeys(lstnam);
	}
	public void enteremployeeid(String empidno)
	{
		addempid.sendKeys(empidno);
	}
	public void clickonsaveButton()
	{
		savbtn.click();
	}
	public void clickonLogoutButton()
	{
		
	}
	
	
}
