package swiggyProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass extends Utility {

	@BeforeMethod
	public void start() throws Exception {

		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));
	}
	/*
	 * else if(browser.equalsIgnoreCase("edge")) {
	 * WebDriverManager.edgedriver().setup(); driver=new EdgeDriver();
	 * 
	 * }
	 */

	@AfterMethod
	public void closeUp() {
		driver.quit();

	}

}
