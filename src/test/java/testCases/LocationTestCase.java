package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LocationPage;


public class LocationTestCase extends swiggyProject.BaseClass {
	
	@Test
	public void tc001_validate_location() throws Exception{
		
		LocationPage lop = new LocationPage();
		
		
		lop.location("Hyderabad");
		
		Thread.sleep(5000);
		WebElement expected = lop.setLocation;
		Assert.assertEquals(expected,"Hyderabad, Telangana, India");
		
		
	}
}

