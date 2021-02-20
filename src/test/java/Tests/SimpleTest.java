package Tests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.TestNG;

import Pages.Home;

public class SimpleTest {
	public WebDriver driver;

	   @BeforeTest
	   public void setup() throws MalformedURLException{
	       //use Chrome Driver
		   //DesiredCapabilities dcap = DesiredCapabilities.chrome();
		   //dcap.setCapability("headless", true);
		   String driverpath = "C:/Users/mnath077/eclipse-workspace/Selenium/drivers/chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver",driverpath);
//	       driver = new ChromeDriver();
		   // Run on docker container
		   //URL gamelan = new URL("http://localhost:4444/wd/hub");
		   ChromeOptions options = new ChromeOptions().setHeadless(true);
	       driver = new ChromeDriver(options);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	   }

	  @Test
	   public void applyAsDeveloper() {
	       //Create object of HomePage Class
	       Home home = new Home(driver);
	       home.clickOnDeveloperApplyButton();

	      
	   }

	    @AfterTest
	    public void close(){
	          driver.close();
	       }
}
