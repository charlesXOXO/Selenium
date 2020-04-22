package E2ETestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Home;
import Resources.driver_details;

public class ValidateText extends driver_details {
	public static Logger log = 	LogManager.getLogger(driver_details.class.getName());
	@BeforeTest
	public void urlintitalize() throws IOException {
		driver = intializedriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void text_course() throws IOException {

		Home ho = new Home(driver);	
		System.out.println(ho.title_().getText());
		Assert.assertEquals(ho.title_().getText(), "FEATURED CORES");
		log.info("The assert was successful");
	}

	@AfterTest
	public void teardowndriver() {
		driver.close();
		driver=null;
	}

}
