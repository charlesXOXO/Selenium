package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Object {
	WebDriver driver;
	public LoginPage_Object(WebDriver driver)
	{
		this.driver=driver;
	}
	By emailID=By.id("user_email");
	By password=By.id("user_password");
	By login_button=By.cssSelector("input.btn.btn-primary.btn-md.login-button");

	public WebElement email() {
		return driver.findElement(emailID);
	}
	
	public WebElement pwd() {
		return driver.findElement(password);
		
	}
	public WebElement login_button() {
		return driver.findElement(login_button);
	}
}
