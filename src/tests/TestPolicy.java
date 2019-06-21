package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPolicy {

	
	public static WebDriver d;
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
		
		d = new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println("i am in policyTestOne");
		
		try {
			d.findElement(By.cssSelector("css=input[name='q']")).sendKeys("good");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("++++++++++++++++++++" + e);
		}
		
		
		
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
