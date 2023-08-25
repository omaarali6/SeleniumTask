package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class KSRTC_ResultsPage extends PageBase {

	public KSRTC_ResultsPage(WebDriver driver) {
		super(driver);
		jes = (JavascriptExecutor) driver;
	}
	
	
	@FindBy(name = "SrvcSelectBtnForward")
	public WebElement SelectSeatButton;
	
	@FindBy(id = "Forward42")
	WebElement Seat31;


	@FindBy(xpath = "/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[2]/div/div[2]/ul/li[3]/a")
	WebElement CustomerDetailsButton;

	@FindBy(id="mobileNo")
	WebElement MobileNumberTextBox;

	@FindBy(id="email")
	WebElement emailTextBox;

	@FindBy(id="PgBtn")
	WebElement MakePaymentBtn;

	@FindBy(id="passengerNameForward0")
	WebElement Name1;

	@FindBy(id="genderCodeIdForward0")
	Select Gender1;


	@FindBy(id="passengerAgeForward0")
	WebElement Age1;


	@FindBy(id="concessionIdsForward0")
	Select Occasion1;

	@FindBy(css = "div.stack svelte-1qs47py.horizontal")
	WebElement CardOption;



	@FindBy(id="card_number")
	WebElement CardNumber;


	@FindBy(id="card_expiry")
	WebElement card_expiry;

	@FindBy(id="card_expiry")
	WebElement card_cvv;

	@FindBy(css = "carousel-control-prev-icon")
	WebElement BackIcon;

	
	
public void fillCustomerData(String Name,String MobileNumber, String Email, String Gender, String Age,String Occasion)
{
	//System.out.println(SelectSeatButton.isEnabled());
	
	clickBtn(SelectSeatButton);
	//jes.executeScript("arguments[0].click();", SelectSeatButton);
	
	if(Seat31.isEnabled())
	{
		clickBtn(Seat31);
	}
	clickBtn(CustomerDetailsButton);
	fillTextBox(MobileNumberTextBox, MobileNumber);
	fillTextBox(emailTextBox, Email);
	fillTextBox(Name1, Name);
	fillTextBox(Age1, Age);
	Gender1.selectByVisibleText(Gender);
	Occasion1.selectByVisibleText(Occasion);
	clickBtn(MakePaymentBtn);
	
}

}
