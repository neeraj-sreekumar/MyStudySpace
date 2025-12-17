package Tests;

import org.testng.annotations.Test;

import Pages.Footer;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FooterTest {
	private WebDriver driver;
	private Footer footer;
	
  @Test
  public void Footers() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  footer.Navigateto();
	  
	  System.out.println("Testing for footer");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.AboutUs();
	  System.out.println("user is on about us page");
	  String expected1="https://mystudyspace.in/about-us/";
	  Assert.assertEquals(driver.getCurrentUrl(),expected1,"user is not in about us page");
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.Services();
	  System.out.println("user is on services page");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://mystudyspace.in/services/","user is not in services page");
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.Courses();
	  System.out.println("user is in courses page");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://mystudyspace.in/courses/","user is not in courses page");
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");Thread.sleep(4000);
	  
	  
	  
	  footer.ContactUs();
	  System.out.println("user is in contact us page");
	  String expected2="https://mystudyspace.in/contact/";
	  Assert.assertEquals(driver.getCurrentUrl(), expected2,"user is not on contactua page");
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.Cbse();
	  System.out.println("user is in CBSE site");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.cbse.gov.in/","User is not in CBSE site");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.Hse();
	  System.out.println("user is in HSE site");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.hsslive.in/","User is not in HSE site");
	  driver.navigate().back();
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.Facebook();
	  System.out.println("user is in facebook login page");
	  Set<String> allWindowHandles=driver.getWindowHandles();
	  String orginalwindowhandle=driver.getWindowHandle();
	  for(String handles:allWindowHandles) {
		  if(!handles.equalsIgnoreCase(orginalwindowhandle)) {
		  driver.switchTo().window(handles);
		  Thread.sleep(3000);
		  Assert.assertEquals(driver.getTitle(),"Study Space | Kochi | Facebook","user is in not in facebook login");
		  driver.close();
		  
		}
	  }
	  driver.switchTo().window(orginalwindowhandle);
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  footer.Instagaram();
	  System.out.println("user is in instagram login");
	  Set<String> allWindowHandles2=driver.getWindowHandles();
//	  String orginalwindowhandle2=driver.getWindowHandle();
	  for(String handles2:allWindowHandles2) {
		  if(!handles2.equalsIgnoreCase(orginalwindowhandle)) {
			  driver.switchTo().window(handles2);
			  Thread.sleep(2000);
			  Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/studyspace.tuition/?igsh=dWQ0Z2s1ODRjdXds#","user is not on instagram");
			  driver.close();
		  }  
	  }
	  System.out.println("insta closed");
	  driver.switchTo().window(orginalwindowhandle);
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  
	  
	  footer.YouTube();
	  System.out.println("user is in youtube login page");
	  Set<String> allWindowHandles3=driver.getWindowHandles();
//	  String orginalwindowhandle=driver.getWindowHandle();
	  for(String handles3:allWindowHandles3) {
		  if(!handles3.equalsIgnoreCase(orginalwindowhandle)) {
			  driver.switchTo().window(handles3);
			  Thread.sleep(2000);
			  Assert.assertEquals(driver.getTitle(),"study space - YouTube","user is not in youtube");
			  driver.close();
		  }  
	  }
	  System.out.println("youtube closed");
	  driver.switchTo().window(orginalwindowhandle);
	  Thread.sleep(4000);
	 
	  footer.Navigateto();
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  System.out.println("clicking enquire now");
	  Thread.sleep(1000);
	  footer.Enqiure();
	  Thread.sleep(3000);
	  System.out.println("User is in enquire now page");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://mystudyspace.in/contact/","the user is not in enquire now page");
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  footer=new Footer(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
