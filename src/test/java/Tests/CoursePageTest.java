package Tests;

import org.testng.annotations.Test;

import Pages.CoursesPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CoursePageTest {
	private WebDriver driver;
	private CoursesPage coursepage; 
  @Test
  public void Courses() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  coursepage.Navigateto();
	  System.out.println("teasting for CoursesPage");
	  
	  coursepage.StudentName();
	  Thread.sleep(2000);
	  coursepage.ParentContactNumber();
	  Thread.sleep(2000);
	  coursepage.Class();
	  Thread.sleep(2000);
	  coursepage.Place();
	  Thread.sleep(2000);
	  coursepage.PlaceChosen();
	  Thread.sleep(2000);
	  coursepage.Message();
	  Thread.sleep(2000);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	   driver=new ChromeDriver();
	   coursepage=new CoursesPage(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
