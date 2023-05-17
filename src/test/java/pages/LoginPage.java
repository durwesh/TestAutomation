package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyProject.BaseClass;



public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "(//a[contains(text(),'Login')])[1]")
	WebElement login;
	
		
	@FindBy(xpath = "//input[@type ='tel']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "(//a[contains(text(),'Login')])[2]")
	WebElement loginButton;
		
	
	@FindBy(xpath = "(//input[@type ='text'])[2]")
	WebElement otp;
	
	@FindBy(xpath = "//a[contains(text(),'VERIFY OTP')]")
	WebElement verfiyOTP;
	
	
	@FindBy(xpath = "//label[contains(text(),'Invalid OTP - Please try again')]")
	public WebElement invalidOTPMessage;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
public static String getTextmethod(WebElement element) {
		
		String eleText = null;		
		eleText = element.getText();
		return eleText;
		
		
	}
	
	public void login(String phoneNumber ,String otp) {
		clickElement(login);
		//this.login.click();
		this.phoneNumber.sendKeys(phoneNumber);
		clickElement(loginButton);
		this.otp.sendKeys(otp);
		clickElement(verfiyOTP);
	
		
	}



}

