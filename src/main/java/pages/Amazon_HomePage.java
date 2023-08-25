package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_HomePage extends PageBase {

	public Amazon_HomePage(WebDriver driver) {
		super(driver);
		
	}

@FindBy(id="twotabsearchtextbox")
WebElement SearchTextBox;

@FindBy(id="nav-search-submit-button")
WebElement SearchButton;

@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
WebElement TodaysDeals;


public void searchFor(String s)
{
	fillTextBox(SearchTextBox, s);
	clickBtn(SearchButton);
}

public void goToTodaysDeals()
{
	clickBtn(TodaysDeals);
}


}