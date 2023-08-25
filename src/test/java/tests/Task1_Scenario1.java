package tests;


import static org.testng.Assert.assertTrue;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.*;

public class Task1_Scenario1 extends TestBase1 {
Amazon_HomePage homePage;
Amazon_ResultsPage ResultPage;
Amazon_ProductPage ProductPage;
Amazon_CartPage CartPage;
String FullString;
String arr[];
String FirstWord;
@Test(priority = 1)
public void checkResult() throws InterruptedException
{
	homePage = new Amazon_HomePage(driver);
	Thread.sleep(20000);
	homePage.searchFor("Car Accessories");
	assertTrue(driver.findElement(By.cssSelector("span.a-color-state.a-text-bold")).getText().contains("Car"));
}
@Test(priority = 2)
public void checkforChosenResult()
{
	ResultPage = new Amazon_ResultsPage(driver);
	ResultPage.chooseFirstResult();
	ProductPage = new Amazon_ProductPage(driver);
	FullString = ProductPage.ProductTitle.getText();
	arr = FullString.split(" ",2);
	FirstWord = arr[0];
	System.out.println(FirstWord);
	//assertTrue(ProductPage.ProductTitle.getText().contains("TICARVE Car Cleaning Gel"));
	
}
@Test(priority = 3)
public void checkCartSize() throws InterruptedException {
	ProductPage = new Amazon_ProductPage(driver);
	ProductPage.addToCart();
	ProductPage.goToCart();
	CartPage = new Amazon_CartPage(driver);
	assertTrue(CartPage.subtotal.getText().contains("1"));
}
@Test(priority = 4)
public void checkThatTheCorrectItemIsAdded()
{
	System.out.println(CartPage.item1.getText());
	assertTrue(CartPage.item1.getText().contains(FirstWord));
}

}
