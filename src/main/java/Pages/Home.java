package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {
   private WebDriver driver;

   //Page URL
   private static String PAGE_URL="https://demoqa.com/";

   //Locators

   //Apply as Developer Button
   @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Elements')]")
   private WebElement elementsCard;

   //Constructor
   public Home(WebDriver driver){
       this.driver=driver;
       driver.get(PAGE_URL);
       //Initialize Elements
       PageFactory.initElements(driver, this);
   }

   public void clickOnDeveloperApplyButton(){

	   elementsCard.click();

   }
}
