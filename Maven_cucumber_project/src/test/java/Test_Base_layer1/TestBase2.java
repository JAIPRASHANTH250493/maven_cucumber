package Test_Base_layer1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase2 extends TestBase1 {


	public static WebDriver driver;                                                          

	public static void initializationMethod() {                                              

		System.setProperty("webdriver.chrome.driver","D:\\All selenium projects\\"           
				+ "ALL selenium projects\\com.cucumberproject\\DRIVER\\chromedriver.exe");   
		driver=new ChromeDriver();                                                           

		driver.manage().window().maximize();                                                 
		driver.manage().deleteAllCookies();                                                  
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);                     

		                   
	}                                                                                        
	@Override
	public void gettitle() {
		// TODO Auto-generated method stub

		String title=driver.getTitle();       
		System.out.println(title);            

	}

	@Override
	public void checkurl() {
		// TODO Auto-generated method stub
		String url=driver.getCurrentUrl();  

		System.out.println(url);            
	}

	@Override
	public void LinksCheck() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub                                    
		List<WebElement> li=driver.findElements(By.tagName("a"));             
		for (int i = 0; i <li.size(); i++) {                                  


			try {                                                             
				HttpURLConnection connection= (HttpURLConnection)new URL(li.get(i).
						getAttribute("href")).openConnection();               

				connection.connect();                                         
				String contenttype=	connection.getContentType();              
				int codes=connection.getResponseCode();                       
				String message=connection.getResponseMessage();               
				System.out.println(li.get(i).getText());                      
				System.out.println("the contenet type is" + contenttype );    
				System.out.println("the codeof link is"+ codes);              
				System.out.println(" the message is "+ message);              

			} catch (MalformedURLException e) {                               
				// TODO Auto-generated catch block                            
				e.printStackTrace();                                          
			} catch (IOException e) {                                         
				// TODO Auto-generated catch block                            
				e.printStackTrace();                                          
			}                                                                 
		}
	}

	@Override
	public void waitmthod(WebElement web) {
		// TODO Auto-generated method stub
		WebDriverWait wait=new WebDriverWait(driver, 20);                         
		wait.until(ExpectedConditions.elementToBeSelected(web));                  


	}



}
