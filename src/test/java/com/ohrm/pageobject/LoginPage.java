package com.ohrm.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
 public WebDriver driver;
 public LoginPage(WebDriver rdriver)
  {
	driver= rdriver;
	PageFactory.initElements(rdriver, this);
  }
  @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
  WebElement userid;
  @FindBy(xpath = "//input[@name='password']")
  WebElement password;
  @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
  WebElement loginbtn;
  
  public void getUsername(String uname)
  {
	  userid.sendKeys(uname);
  }
  public void getPassword(String pwd)
  {
	  password.sendKeys(pwd);
  }
  public void clickonloginbtn()
  {
	  loginbtn.click();
  }
  
}


