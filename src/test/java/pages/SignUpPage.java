package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyProject.BaseClass;



public class SignUpPage extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement signUp;
	
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//button[contains(text(),'Have a referral code?')]")
	WebElement referralCode;

	
	@FindBy(xpath = "//a[contains(text(),'CONTINUE')]")
	WebElement submit;
	
	@FindBy(xpath = "//label[contains(text(),'Invalid email address')]")
	public WebElement textMessage;
	
	public SignUpPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static String getTextmethod(WebElement element) {
		
		String eleText = null;		
		eleText = element.getText();
		return eleText;
		
		
	}
	
	
	public void signup(String mobileNumber,String name,String emailAddress) {
		clickElement(signUp);
		//this.signUp.click();
	    this.mobileNumber.sendKeys(mobileNumber);
		this.name.sendKeys(name);
		this.emailAddress.sendKeys(emailAddress);
		clickElement(submit);
	
		
	}


}

