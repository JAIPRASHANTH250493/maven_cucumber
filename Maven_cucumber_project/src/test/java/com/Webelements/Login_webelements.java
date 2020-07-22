package com.Webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base_layer1.TestBase2;

public class Login_webelements extends TestBase2 {

	public Login_webelements() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='top-links']//ul/li[4]/a")
	private WebElement loginbutton;

	@FindBy(name ="youama-email")
	private WebElement loginemail;


	@FindBy(name="youama-password")
	private WebElement pasword;

	@FindBy(xpath = "//*[@id=\"header-account2\"]/div[1]/div/div/div[4]/div/button/span/span")
	private WebElement signinbutton;


	public void clickloginbutton() {
		loginbutton.click();
	}

	public void loginemailmethod_password(String uname,String pwd) {

		loginemail.clear();
		loginemail.sendKeys(uname);

		pasword.clear();
		pasword.sendKeys(pwd);

		signinbutton.click();
	}

}
