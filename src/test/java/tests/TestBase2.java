package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase2 {
public static WebDriver driver;


@BeforeSuite
@Parameters({"Browser"})
public void startDriver(@Optional("chrome") String BrowserName)
{
	if (BrowserName.equalsIgnoreCase("chrome"))
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--kiosk");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
	driver = new ChromeDriver(options);
	} else if (BrowserName.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	} else {}
	driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	
}

@AfterMethod
public void takeScreenshotOnFail(ITestResult result)
{
	if (result.getStatus() == ITestResult.FAILURE) {
		System.out.println("Failure, Taking a screenshot.. ");
		Helper.captureScreenshot(driver, result.getName());
	}
}


@AfterSuite
public void stopDriver()
{
	driver.quit();
}
}
