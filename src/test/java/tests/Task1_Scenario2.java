package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.Amazon_CartPage;
import pages.Amazon_HomePage;
import pages.Amazon_ProductPage;
import pages.Amazon_TodaysDealsPage;

public class Task1_Scenario2 extends TestBase1 {

Amazon_HomePage HomePage2;
Amazon_TodaysDealsPage DealsPage;
Amazon_ProductPage ProductPage2;
Amazon_CartPage CartPage2;

@Test(priority=1)
public void checkTodaysdealsPage() throws InterruptedException
{
	HomePage2 = new Amazon_HomePage(driver);
	Thread.sleep(15000);
	driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
	HomePage2.goToTodaysDeals();
	DealsPage = new Amazon_TodaysDealsPage(driver);
	assertTrue(DealsPage.PageTitle.getText().equalsIgnoreCase("Today's Deals"));
}
@Test(priority=2)	
public void checkThatCorrectOptionsIsSelected() throws InterruptedException
{
	DealsPage = new Amazon_TodaysDealsPage(driver);
	DealsPage.checkGroceriesAndHeadphones();
	DealsPage.check10Disc();
	new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(DealsPage.Page3Btn));
	DealsPage.goTo3rdPage();
	new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(DealsPage.Item));
	DealsPage.goToProduct();
}

@Test(priority = 3)
public void checkthatItemIsAddedToCart()
{
	ProductPage2 = new Amazon_ProductPage(driver);
	ProductPage2.addToCart();
	assertTrue(ProductPage2.CartSize.getText().contains("1"));
}




}
