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

		System.out.println("Nikita has updated code is");
		System.out.println("Nikita updated back this code");
		System.out.println("Nikita updated back this code 667777");
		System.out.println("Nikita updated back this code 555445");
		driver = intializeDricver();
		driver.get("https://www.google.com/");
		System.out.println("this is test two");
	}
	
	@AfterMethod
	public void clouser() {
		driver.quit();
		
	}
}
