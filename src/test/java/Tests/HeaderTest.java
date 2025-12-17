package Tests;

import org.testng.annotations.Test;

import Pages.Header;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HeaderTest {
	private WebDriver driver;
	private Header header;
	  @Test
	  public void HeaderTes() throws InterruptedException {
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  header.Navigateto();
		  
		  System.out.println("Testing for header");
		  
		  header.StustSpaceIcon();
		  System.out.println("User is in home page");
		  String Expected0="https://mystudyspace.in/";
		  Assert.assertEquals(driver.getCurrentUrl(),Expected0,"not in home page");
		  Thread.sleep(4000);
		  
		  header.HomeButton();
		  System.out.println("User is in home page");
		  String Expected1="https://mystudyspace.in/";
		  Assert.assertEquals(driver.getCurrentUrl(),Expected1,"not in home page");
		  Thread.sleep(4000);
		  
		  
		  header.AboutUsButton();
		  System.out.println("user is in about us page ");
		  String Expected2="https://mystudyspace.in/about-us/";
		  Assert.assertEquals(driver.getCurrentUrl(),Expected2,"not in about us page");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);
		  
		  header.ServicesButton();
		  System.out.println("user is in services page");
		  String Expected3="https://mystudyspace.in/services/";
		  Assert.assertEquals(driver.getCurrentUrl(),Expected3,"not in services page");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);
		  
		  header.CoursesButton();
		  System.out.println("user is in courses page");
		  String Expected4="https://mystudyspace.in/courses/";
		  Assert.assertEquals(driver.getCurrentUrl(),Expected4,"not in Course page");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);
		  
		  header.ContactUsButton();
		  System.out.println("user is i Contactus page");
		  String Expected5="https://mystudyspace.in/contact/";
		  Assert.assertEquals(driver.getCurrentUrl(),Expected5,"not in contactus page");
		  Thread.sleep(4000);
		  driver.navigate().back();
		  Thread.sleep(4000);
		  
		  header.PhoneButton();
		  
		  header.WattsAppButton();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  driver=new ChromeDriver();
		  header=new Header(driver);
	  }

	  @AfterMethod
	  public void afterMethod() {	  
		  driver.close();
	  }
}
