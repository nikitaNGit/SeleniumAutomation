package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base{
	
	public WebDriver driver;
	Logger log;
	

	@Test(dataProvider="getLoginData")
	public void login(String email,String password,String expectedresult) throws IOException {
		
		LandingPage lpage = new LandingPage(driver);
		LoginPage loginP = new LoginPage(driver);
		AccountPage accPage = new AccountPage(driver);
		
		lpage.myAccountDropdown().click();
		log.debug("Clicked on myAccount Dropdown");
		loginP.login().click();
		log.debug("logging field got opened");
		loginP.Email().sendKeys(email);
		log.debug("Email id got enter");
		loginP.Password().sendKeys(password);
		log.debug("Password got enterd");
		loginP.loginBtn().click();
		log.debug("Clicked on login button");
		
		String actualResult = null;
		try {
			if(accPage.AccountPage().isDisplayed()) {
			actualResult="Successfull";
	
		}
			}catch(Exception e ) {
				
				actualResult = "Failure";
			}
		
		Assert.assertEquals(actualResult, expectedresult);
		log.debug("Login test got pass");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data = {{"nikitanikam77777@gmail.com","NikitaDemo@12","Successfull"},{"abc@gmail.com","5ftt","Failure"}};
		return data;
	}
	
	@BeforeMethod
	public void oppenApplication() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver = intializeDricver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application url");
	}
	
	@AfterMethod
	public void clouser() {
		driver.quit();
		log.debug("Browser got closed");
	}
}


