package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

@Test
public class FourTest extends Base {
	public WebDriver driver;
	public void TestFour() throws IOException {
		
		System.out.println("Code has been updated");
		System.out.println("code been updated from kbranch to main branch");
		
		driver = intializeDricver();
		System.out.println("this is test Four");
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void clouser() {
		driver.quit();
		
	}
}
