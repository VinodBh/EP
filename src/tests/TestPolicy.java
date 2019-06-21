package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPolicy {

	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Workspace\\TestEP\\Resources\\chromedriver.exe");
		
		
	}
	
	
	
	@Test
	public void policyTestOne() {
		System.out.println("i am in policyTestOne");
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
