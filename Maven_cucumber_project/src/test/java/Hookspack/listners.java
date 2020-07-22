package Hookspack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Test_Base_layer1.TestBase2;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class listners extends TestBase2 {

	
	@After
	public void screenshot(Scenario scenario) throws IOException {
		
		String status=scenario.getStatus();
		System.out.println(status);

		if(scenario.isFailed()==true) {
			
			TakesScreenshot screen=(TakesScreenshot)driver;
			File source=screen.getScreenshotAs(OutputType.FILE);
			byte[] filebyte=screen.getScreenshotAs(OutputType.BYTES);
			
			File destination=new File("D:\\Cumcumber\\Maven_cucumber_project\\SCreenShotFolder"+scenario.getName()+".png");
			FileUtils.copyFile(source, destination);
			scenario.embed(filebyte,"image/png");
		}
	
	}
	
}
