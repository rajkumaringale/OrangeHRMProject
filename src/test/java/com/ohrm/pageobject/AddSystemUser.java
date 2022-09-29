package com.ohrm.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSystemUser {
	
	
	  WebDriver driver;
	  public AddSystemUser(WebDriver rdriver)
	  {
		driver= rdriver;
		PageFactory.initElements(rdriver, this);
	  }
     
	  @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
      WebElement clickAdmin;
	  
	  @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
      WebElement clickAddbtn;
	  
	  @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
      WebElement clickuserrole;
	  
	  @FindBy(xpath = "//input[@placeholder='Type for hints...']")
	  WebElement enterempname;
	  
	  @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
      WebElement clickstatus;
	  
	  @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
	  WebElement enteruname;
	  
	  @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
      WebElement enterpwd;
	  
	  @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
      WebElement entercnfpwd;
	  
	  @FindBy(xpath = "//button[normalize-space()='Save']")
	  WebElement clicksave;
      
	  @FindBy(xpath = "//button[normalize-space()='Cancel']")
      WebElement clickcancel;
	  
	  public void clickonadmin()
	  {
		  clickAdmin.click();
	  }
	  public void clickonaddbutton()
	  {
		  clickAddbtn.click();
	  }
	  public void clickonuserrole()
	  {   
		  clickuserrole.click();
	  }
	  public void enterEmployeename(String entrempnm)
	  {
		  enterempname.sendKeys(entrempnm); 
	  }
	  public void  clickonstatus()
	  {
		  clickstatus.click();
	  }
      public void enterusername(String username)
      {
    	  enteruname.sendKeys(username);
      }
      public void enterpassward(String pwd)
      {
    	  enterpwd.sendKeys(pwd);
      }
      public void clickonconfirmpassward(String pwd)
      {
    	  entercnfpwd.sendKeys(pwd);
      }
      public void clickonsavebtn()
      {
    	  clicksave.click();
      }
      public void clickoncancel()
      {
    	  clickcancel.click();
      }
}
