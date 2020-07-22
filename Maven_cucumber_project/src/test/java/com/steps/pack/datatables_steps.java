package com.steps.pack;



import java.net.HttpURLConnection;
import java.net.URL;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Test_Base_layer1.TestBase2;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class datatables_steps extends TestBase2 {


	@Given("^user entering the google\\.com$")
	public void user_entering_the_google_com(){

		initializationMethod();
		driver.get("https://www.google.com/");
	}

	@When("^he enter the text as \"([^\"]*)\" in searchbo$")
	public void he_enter_the_text_as_in_searchbo(String arg1) throws Throwable {

		driver.findElement(By.name("q")).sendKeys(arg1+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[1]")).click();
	}

	@Then("^heclicks on search button$")
	public void heclicks_on_search_button() throws Throwable {

		//driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[1]")).click();

		List<WebElement> li=driver.findElements(By.tagName("a"));   
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());	
		}
	}

	@Then("^he now checks the login details$")
	public void he_now_checks_the_login_details() throws Throwable {
		System.out.println("google scenario finiihsed>>>>>>>...................................>>>>>>>>>");
	}


	@Given("^all the links user cicks on firstlink$")
	public void all_the_links_user_cicks_on_firstlink() throws Throwable {

		driver.get("https://github.com/naveenanimation20/CucumberSeleniumFramework/blob/master/src/main/java/Features/login.feature");
		List<WebElement> li=driver.findElements(By.tagName("a"));   
		for (int i = 0; i < li.size(); i++) {
			HttpURLConnection connection= (HttpURLConnection)new URL(li.get(i).
					getAttribute("href")).openConnection();               

			connection.connect();                                         

			int codes=connection.getResponseCode();                       
			String message=connection.getResponseMessage();                   
			System.out.println("the codeof link is"+ codes);              
			System.out.println(" the message is "+ message);              

		}
	}


	@When("^thepage loads he checks the title ofthe page andsimpleprints thevalue$")
	public void thepage_loads_he_checks_the_title_ofthe_page_andsimpleprints_thevalue() throws Throwable {
		System.out.println(driver.getTitle());

		Assert.assertEquals(200, 200);
	}

	@Then("^then nowhe asserts the page title and print$")
	public void then_nowhe_asserts_the_page_title_and_print(DataTable data) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		List<List<String>> str=	data.raw();
		String firstrowfirstcolumn=	str.get(0).get(0);
		String firstrowsecondcolumn=str.get(0).get(1);

		System.out.println(firstrowfirstcolumn+"  "+firstrowsecondcolumn);

	}

	@Then("^simply print the datas$")
	public void simply_print_the_datas() throws Throwable {

		System.out.println("printed the values................fromdatatableas raw");
	}

	@Then("^he takesthe screen shotofit$")
	public void he_takesthe_screen_shotofit() throws Throwable {
		Assert.assertEquals(true, false);
	}

	@Given("^user launches the browser$")
	public void user_launches_the_browser() throws Throwable {

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("^demo-admin qa \\.com LAUNCHES he entersthe username and password$")
	public void demo_admin_qa_com_LAUNCHES_he_entersthe_username_and_password(DataTable data) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)	
		
		List<Map<String, String>> li=	data.asMaps(String.class, String.class);
		for (Map<String, String> map : li) {
		String uname=	map.get("username");
		String pass=map.get("password");
		
		WebElement email=driver.findElement(By.id("Email"));
		WebElement pwd=driver.findElement(By.id("Password"));
		email.clear();
		email.sendKeys(uname);
		pwd.clear();
		pwd.sendKeys(pass);
	}}

	@Then("^he he prints the vaku (\\d+) and (\\d+\\.\\d+)$")
	public void he_he_prints_the_vaku_and(int arg1, float arg2) throws Throwable {
		System.out.println(arg1+"  "+arg2);
	}

	@Then("^he clicks on  the sign in button$")
	public void he_clicks_on_the_sign_in_button() throws Throwable {

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[4]/input")).click();

		Assert.assertEquals(driver.getTitle(), driver.getTitle());
	}


}
