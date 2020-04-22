package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	WebDriver driver;

	public Home(WebDriver driver) {

		this.driver = driver;
	}

	By login = By.cssSelector("a[href *= 'sign_in']");
	By title_course = By.xpath("//section[@id = 'content']/div/div/h2");
	By navigation = By.cssSelector("ul.nav.navbar-nav.navbar-right>li>a");

	public WebElement login_login() {
		return driver.findElement(login);
	}

	public WebElement title_() {
		return driver.findElement(title_course);
	}

	public WebElement navigation_assert() {
		return driver.findElement(navigation);

	}

}
