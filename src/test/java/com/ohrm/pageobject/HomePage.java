package com.ohrm.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	  public HomePage(WebDriver d)
	  {
		driver= d;
		PageFactory.initElements(driver, this);
	  }
	  @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	  WebElement dropdwn;
	  @FindBy(xpath = "//a[text()='Logout']")
	  WebElement clickonlogout;
	  
	  @FindBy(xpath = "")
	  WebElement addsystemuser;
	  
	  public void clickonuserdropdown()
	  {
		  dropdwn.click();
	  }
	  public void selectlogoutbtn(int index)
	  {
		  Select drop = new Select(clickonlogout);
		  drop.selectByIndex(index);
	  }

}
