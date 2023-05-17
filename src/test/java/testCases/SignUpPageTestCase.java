package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SignUpPage;

public class SignUpPageTestCase extends swiggyProject.BaseClass {
	
	@Test
	public void tc001_validate_signup_Flow() {

		SignUpPage sp = new SignUpPage();
		sp.signup("8686034396", "sajid_441@yahoo.com", "Test@1234");
		// sp.signup("sajid_441@gmail.com", "test@123");
		String actual = driver.getTitle();
		System.out.println("actual");

		AssertJUnit.assertEquals(
				"Order food online from India's best food delivery service. Order from restaurants near you",
				driver.getTitle());

		// Assert.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build
		// Careers",driver.getTitle());

	}

	@Test
	public void tc002_validate_signup_Flow_Invalidaddress() {

		SignUpPage sp = new SignUpPage();
		sp.signup("8686034396", "sajid_441@yahoo.com", "Test@1234");
		// sp.signup("sajid_441@gmail.com", "test@123");
		String expected = sp.getTextmethod(sp.textMessage);

		AssertJUnit.assertEquals(expected, "Invalid email address");

		// Assert.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build
		// Careers",driver.getTitle());

	}

}
