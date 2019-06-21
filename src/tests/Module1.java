package tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Module1 {

	@BeforeMethod
	public void beforeClass() {
		System.setProperty("", "");
	}

	@AfterMethod
	public void afterClass() {
		
	}
	
	
	@Test
	public void testOne() {

	}
	
	
	
	
}
