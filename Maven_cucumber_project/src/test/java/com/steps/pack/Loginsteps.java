package com.steps.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Webelements.Login_webelements;

import Test_Base_layer1.TestBase2;
import cucumber.api.java.en.*;

public class Loginsteps extends TestBase2{

	Login_webelements login;
	Loginsteps steps;
	
	
	
	
	
	
	
	@Given("^user launcheshe browser google$")
	public void user_launcheshe_browser_google(){
		
		initializationMethod();
		driver.get("https://www.titaneyeplus.com/");                                         
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); 
		steps=new Loginsteps();
	   }
	

	@When("^he browserlaunches he enters the username and password \"([^\"]*)\"  \"([^\"]*)\"$")
	public void he_browserlaunches_he_enters_the_username_and_password(String arg1, String arg2)  {
		System.out.println(arg1+""+arg2);
	   driver.findElement(By.xpath("//div[@class='top-links']//ul/li[4]/a")).click();
	  
	   
	}

	@Then("^he clicks the sign in  button tologin$")
	public void he_clicks_the_sign_in_button_tologin() {
	
		//steps.LinksCheck();
		steps.gettitle();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("jaiprashanth2504@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("J@i250493");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).click();
	}

	public void sample() {
		System.out.println("im the sample method  afterlast then ");
	}
}
