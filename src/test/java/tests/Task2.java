package tests;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.KSRTC_HomePage;
import pages.KSRTC_ResultsPage;

public class Task2 extends TestBase2 {
CSVReader reader;
	
@SuppressWarnings("deprecation")
@Test(priority = 1)
public void checkCorrectDataIsEntered() throws InterruptedException, CsvValidationException, IOException {
KSRTC_HomePage HomePage = new KSRTC_HomePage(driver);
new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(HomePage.BackBtn));
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
HomePage.chooseDesiredOptions();
}

@Test(priority = 2)
public void checkSeatData() throws InterruptedException, CsvValidationException, IOException
{
	KSRTC_ResultsPage ResultPage = new KSRTC_ResultsPage(driver);
	Thread.sleep(10000);
	new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(ResultPage.SelectSeatButton));
	//driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);

	String FilePath = System.getProperty("user.dir")+"\\src\\test\\java\\data\\Userdata.csv";
	reader = new CSVReader(new FileReader(FilePath));

	String[] row;

	while( (row = reader.readNext()) != null )
	{
		String name= row[0];
		String MobileNumber= row[1];
		String email= row[2];
		String gender= row[3];
		String age= row[4];
		String occasion= row[5];

	ResultPage.fillCustomerData(name, MobileNumber, email, gender, age,occasion);
	}
}






}
