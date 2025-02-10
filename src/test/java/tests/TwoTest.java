package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

@Test
public class TwoTest extends Base{
	WebDriver driver;
	public void TestTwo() throws IOException {
		
		driver = intializeDricver();
		driver.get("https://www.google.com/");
		System.out.println("this is test two");
	}
	
	@AfterMethod
	public void clouser() {
		driver.quit();
		
	}
}
