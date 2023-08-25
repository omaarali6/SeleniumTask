package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KSRTC_HomePage extends PageBase {

	public KSRTC_HomePage(WebDriver driver) {
		super(driver);
		jes = (JavascriptExecutor) driver;
	}

	
@FindBy(id="txtJourneyDate")
WebElement DateOfDepartureButton;

@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[4]/td[7]/a")
WebElement Sept23;

@FindBy(xpath = "//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")
WebElement PopularRoute;


@FindBy(css = "span.ui-icon.ui-icon-circle-triangle-e")
WebElement NextMonthButton;

@FindBy(xpath = "//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")
WebElement SearchForBusButton;

@FindBy(css = "a.carousel-control-prev")
public WebElement BackBtn;


public void chooseDesiredOptions()
{
	//jes.executeScript("scrollBy(0,1000)");
	jes.executeScript("arguments[0].scrollIntoView(true);", BackBtn);
	clickBtn(BackBtn);
	clickBtn(PopularRoute);
	clickBtn(NextMonthButton);
	clickBtn(Sept23);
	clickBtn(SearchForBusButton);
}

}


