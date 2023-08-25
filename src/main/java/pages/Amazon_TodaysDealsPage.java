package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_TodaysDealsPage extends PageBase {

	
public Amazon_TodaysDealsPage(WebDriver driver) {
		super(driver);
		jes = (JavascriptExecutor) driver;
	}


@FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[21]/label/input")
WebElement HeadphonesCheckBox;


@FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/input")
WebElement GroceriesCheckBox;


@FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span")
WebElement Disc10;

@FindBy(xpath = "//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[4]/a")
public WebElement Page3Btn;

@FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div/img")
public WebElement Item;

@FindBy(xpath = "//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a/div")
WebElement color;

@FindBy(xpath = "//*[@id=\"slot-2\"]/div/h1")
public WebElement PageTitle; 

public void checkGroceriesAndHeadphones()
{
	jes.executeScript("arguments[0].scrollIntoView(true);", HeadphonesCheckBox);
	HeadphonesCheckBox.click();
	jes.executeScript("arguments[0].scrollIntoView(true);", GroceriesCheckBox);
	GroceriesCheckBox.click();
}

public void check10Disc()
{
	jes.executeScript("arguments[0].scrollIntoView(true);", Disc10);
	Disc10.click();
}

public void goTo3rdPage() throws InterruptedException
{
	jes.executeScript("arguments[0].scrollIntoView(true);", Page3Btn);
	Thread.sleep(3000);
	Page3Btn.click();
}

public void goToProduct() throws InterruptedException
{
	jes.executeScript("arguments[0].scrollIntoView(true);", Item);
	Thread.sleep(3000);
	Item.click();
	Thread.sleep(3000);
	//clickBtn(color);
}



}
