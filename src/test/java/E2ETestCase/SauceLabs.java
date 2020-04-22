package E2ETestCase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "70.0");
		final String USERNAME = "clown.c";
		final String ACCESS_KEY = "f8ea8b37-7215-4432-b70a-d70a56f81c66";
		final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(URL) , caps);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SauceLabs");;
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}
}
