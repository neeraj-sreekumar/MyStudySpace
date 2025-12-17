package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HomePageTest {
	private WebDriver driver;
	private HomePage homepage;
  @Test
  public void Homepage() throws InterruptedException, AWTException {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  homepage.navigateTo();
	  
	  System.out.println("Testing for Home page");
	  
	  
	  homepage.ScrollingBookNowButton();
	  System.out.println("user is in courses page");
	  String ExpectedURL2="https://mystudyspace.in/courses/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL2,"Not in Booking page");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
	  homepage.AboutUsReadingMoreButton();
	   System.out.println("user is in aboutus page");
	  String ExpectedURL3="https://mystudyspace.in/about-us/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL3,"Not in about us page");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
	  
	  homepage.DailySchoolSupportReadMoreButton();
	  System.out.println("user is in Services page");
	  String ExpectedURL4="https://mystudyspace.in/services/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL4,"Not in Our Services page");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
	  
	  homepage.SpecialGroupTutionReadMoreButton();
	  System.out.println("user is in Services page");
	  String ExpectedURL5="https://mystudyspace.in/services/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL5,"Not in Our Services page");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
	  
	  homepage.OneOnOneTutionReadMoreButton();
	  System.out.println("user is in Services page");
	  String ExpectedURL6="https://mystudyspace.in/services/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL6,"Not in Our Services page");
	  driver.navigate().back();
	  Thread.sleep(4000);
	 
	  
	  homepage.DailySchoolSupportRegisterNowButton();
	  System.out.println("user is in courses page");
	  String ExpectedURL7="https://mystudyspace.in/courses/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL7,"Not Enquire now page displayed");
	  driver.navigate().back();
	  Thread.sleep(4000);
	 
	  
	  homepage.SpecialGroupTutionRegisterNowButton();
	  System.out.println("user is in courses page");
	  String ExpectedURL8="https://mystudyspace.in/courses/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL8,"Not Enquire now page displayed");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
	  homepage.OneOnOneTutionRegisterNowButton();
	  System.out.println("user is in courses page");
	  String ExpectedURL9="https://mystudyspace.in/courses/";
	  Assert.assertEquals(driver.getCurrentUrl(),ExpectedURL9,"Not Enquire now page displayed");
	  Thread.sleep(4000);
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  homepage=new HomePage(driver);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
