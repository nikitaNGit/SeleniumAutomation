package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//Input[@value='Login']")
	WebElement loginBtn;
	
	public WebElement login() {
		return login;
	}
	
	public WebElement Email() {
		return email;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement loginBtn() {
		return loginBtn;
	}

}
