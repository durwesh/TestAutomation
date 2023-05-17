package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import swiggyProject.BaseClass;


public class LoginPageTestCase extends swiggyProject.BaseClass {
	
	@Test
	public void tc002_validate_login_Flow() throws Exception{
		
		LoginPage lp = new LoginPage();
		
		
		lp.login("8686034396", "123456");
		
		//Thread.sleep(5000);
		String expected = lp.getTextmethod(lp.invalidOTPMessage);
		Assert.assertEquals(expected,"Invalid OTP - Please try again");
		
		
	}
}

