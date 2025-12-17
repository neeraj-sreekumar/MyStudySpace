package Tests;

import org.testng.annotations.Test;

import Pages.ServicesPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ServicesPageTest {
	private WebDriver driver;
	private ServicesPage services;
	
  @Test
  public void Services() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  services.NavigateTo();
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Testing for services page");
	  
	  
	  services.DailySchoolSupportRegisterNowButton();
	  
	  System.out.println("user is in courses page");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://mystudyspace.in/courses/","user is not in sevices page");
	  Thread.sleep(4000);
	  driver.navigate().back();
	  
	  services.OneOnONeTutionRegisterNowButton();
	  System.out.println("user is in courses page");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://mystudyspace.in/courses/","user is not in sevices page");
	  Thread.sleep(4000);
	  driver.navigate().back();
	  
	  services.SpecialGroupTutionRegisterNowButton();
	  System.out.println("user is in courses page");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://mystudyspace.in/courses/","user is not in sevices page");
	  Thread.sleep(4000);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  services=new ServicesPage(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
