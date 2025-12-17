package Tests;

import org.testng.annotations.Test;

import Pages.ContactUsPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ContactUsPageTest {
	private WebDriver driver;
	private ContactUsPage Contactus;
  @Test
  public void Contact() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  Contactus.navigateTo();
	  
	  System.out.println("Testing for contact us page");
	  
	  Contactus.Name();
	  Contactus.Email();
	  Contactus.Number();
	  Contactus.Message();
	  
	  Contactus.CochinContact();
	  
	  
	  Contactus.CochinWattsApp();
	  Contactus.TrivandrumContact();
	  Contactus.TrivandrumWattsApp();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  Contactus=new ContactUsPage(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
