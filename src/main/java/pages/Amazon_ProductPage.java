package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_ProductPage extends PageBase {

	public Amazon_ProductPage(WebDriver driver) {
		super(driver);
	}

@FindBy(id = "nav-cart")
WebElement CartBtn;

@FindBy(id="productTitle")
public WebElement ProductTitle;

@FindBy(id = "submit.add-to-cart")
public WebElement AddToCartBtn;

@FindBy(id = "buy-now-button")
public WebElement BuyNowBtn;

@FindBy(xpath = "//*[@id=\"nav-cart-count\"]")
public WebElement CartSize;

public void addToCart()
{
	clickBtn(AddToCartBtn);
}
	
public void goToCart()
{
	clickBtn(CartBtn);
}
	
	
}
