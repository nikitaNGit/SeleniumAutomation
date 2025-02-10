package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

@Test
public class ThreeTest extends Base {
	WebDriver driver;
	
	public void TestThree() throws IOException {
		
		System.out.println("This Testthree is updated");
		
		driver = intializeDricver();
		driver.get("https://www.google.com/");
		System.out.println("this is test Three");
	}
	
	@AfterMethod
	public void clouser() {
		driver.quit();
		
	}
}
