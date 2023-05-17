package swiggyProject;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

public static WebDriver driver;
	
	// Launch url
	public static void launchUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	// Get properties
	public static String getpropvalue(String key) {
		String value = null;
		try {
			
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	// Browser Launch
	public static void browserLaunch(String name) {

		switch (name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			System.out.println("No valid options given choosing the default browser");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	// Check for element availability
	public static boolean waitforme(WebElement element) {
		boolean flag = false;

		try {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			//test.log(Status.PASS, id + "is available");
			flag = true;
		} catch (Exception e) {
			System.out
					.println("Error occured while waiting for the element :"  + "with exception " + e.getMessage());
			//test.log(Status.FAIL, id + "is not available");

		}
		return flag;
	}
	// Click a Web Element
	public void clickElement(WebElement element) {
		try {

			if (waitforme(element)) {
				element.click();
				//test.log(Status.PASS, id + "is clicked ");
			}
		} catch (Exception e) {
			System.out.println("Error in clicking the webelement :"  + e.getMessage());
			//test.log(Status.FAIL, "Failed to click the element :" + id);
		}

	}
}
