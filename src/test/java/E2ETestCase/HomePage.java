package E2ETestCase;

import org.apache.logging.log4j.*;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.Home;
import PageObjects.LoginPage_Object;
import Resources.driver_details;

public class HomePage extends driver_details {

	public static Logger log = LogManager.getLogger(driver_details.class.getName());

	@Test(dataProvider = "getData")
	public void Base_Navigation(String emailid, String pwd, String text) throws IOException {
		driver = intializedriver();
		driver.get(prop.getProperty("url"));
		Home ho = new Home(driver);
		ho.login_login().click();
		LoginPage_Object lo = new LoginPage_Object(driver);
		lo.email().sendKeys(emailid);
		lo.pwd().sendKeys(pwd);
		log.info(text);
		lo.login_button().click();
		driver.close();
		driver=null;
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];

		// 1st Row
		data[0][0] = "nonrestricteddata@gmail.com";
		data[0][1] = "123445";
		data[0][2] = "Non Restricted User";

		// 2nd Row
		data[1][0] = "restricteddata@gmail.com";
		data[1][1] = "123222";
		data[1][2] = "Restricted User";
		return data;

	}
}