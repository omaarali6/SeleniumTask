package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_CartPage extends PageBase{

	public Amazon_CartPage(WebDriver driver) {
		super(driver);
	}

@FindBy(id="sc-subtotal-label-activecart")
public WebElement subtotal;

@FindBy(css = "span.a-truncate-cut")
public WebElement item1;

	
	
}
