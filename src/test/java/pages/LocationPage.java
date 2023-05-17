package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyProject.BaseClass;

public class LocationPage extends BaseClass {
	
	@FindBy(xpath = "(//input[@type ='text'])[1]")
	WebElement enterLocation;
	
	@FindBy(xpath = "(//span[contains(text(),'Hyderabad, Telangana, India')])[1]")
	WebElement selectLocation;
	
	@FindBy(xpath = "//span[contains(text(),'Hyderabad, Telangana, India')]")
	public WebElement setLocation;
	
	
	
	public LocationPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
		
	public void location(String enterLocation) {
		
	
	    this.enterLocation.sendKeys(enterLocation);
		clickElement(selectLocation);
		
	
		
	}


}
