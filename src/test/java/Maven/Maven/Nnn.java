package Maven.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nnn {

WebDriver driver;
	
	@Test 
	public void browser()  {
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://mail.tcs.com");
	}
	

}
