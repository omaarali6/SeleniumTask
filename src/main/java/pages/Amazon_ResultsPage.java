package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_ResultsPage extends PageBase {
	public Amazon_ResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]")
WebElement FirstResult;



public void chooseFirstResult()
{
	clickBtn(FirstResult);
}


}
