package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement untbx;

@FindBy(name="pwd")
private WebElement pwdtbx;

@FindBy(xpath="//div[text()='login']")
private WebElement loginbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setLogin(String un,String pwd) {
	untbx.sendKeys(un);
	pwdtbx.sendKeys(pwd);
	loginbtn.click();
	
}





}
