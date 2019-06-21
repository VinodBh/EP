package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPolicy {

	
	public WebDriver d;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Workspace\\TestEP\\Resources\\chromedriver.exe");
		
	}
	
	@BeforeMethod
	public void afterMethod() {
		if(d != null) {
			d.quit();
			
		}
		
	}
	
	
	
	@Test
	public void policyTestOne() {
		System.out.println("i am in policyTestOne");
		d = new ChromeDriver();
		d.get("https://www.google.com");
		
	}
	
	
	@Test
	public void policyTestTwo() {
		System.out.println("i am in policyTestTwo");
	}
	
	@Test
	public void policyTestThree() {
		System.out.println("i am in policyTestThree");
	}
	
	
}
