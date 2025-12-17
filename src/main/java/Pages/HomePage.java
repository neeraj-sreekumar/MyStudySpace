package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	private final String url="https://mystudyspace.in/";
	
	private By EnquireNow=By.xpath("/html/body/div[1]/div/div[2]/section/div[4]/div/div/div[2]/section/div/div/div/div/a");
	private By ScrollingBookNow=By.xpath("/html/body/div[1]/div/div[3]/div/a");
	private By AboutUsReadMore=By.xpath("/html/body/div[1]/div/div[4]/section/div/div[2]/div/div/section/div/div/div/div[2]/a");
	private By DailySchoolSupportReadMore=By.xpath("/html/body/div[1]/div/div[5]/section/div/div/div/div/section/div/div/div/div[1]/section/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/a");
	private By SpecialGroupTutionReadMore=By.xpath("/html/body/div[1]/div/div[5]/section/div/div/div/div/section/div/div/div/div[2]/section/div/div[1]/div/div[2]/div/div[2]/div/a");
	private By OneOnOneTutionReadMore=By.xpath("/html/body/div[1]/div/div[5]/section/div/div/div/div/section/div/div/div/div[2]/section/div/div[3]/div/div[2]/div/div[2]/div/a");
	private By DailySchoolSupportRegisterNow=By.xpath("/html/body/div[1]/div/div[7]/section/div/div/div/div/section/div/div[1]/div/div/section/div/div/div/div[3]/a");
	private By SpecialGroupTutionRegisterNow=By.xpath("/html/body/div[1]/div/div[7]/section/div/div/div/div/section/div/div[2]/div/div/section/div/div/div/div[3]/a");
	private By OneOnOneTutionRegisterNow=By.xpath("/html/body/div[1]/div/div[7]/section/div/div/div/div/section/div/div[3]/div/div/section/div/div/div/div[3]/a");
	
	public HomePage(WebDriver driver){
		 this.driver=driver;
	 }
	
	public void navigateTo() {
		driver.get(url);
	}
	
//	public void EnquireNowButton(){
//		
//
//		WebElement element1=driver.findElement(EnquireNow);
////		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		element1.click();
//	}
	public void ScrollingBookNowButton() throws InterruptedException {
		
//	
		WebElement element2=driver.findElement(ScrollingBookNow);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		element2.click();
		
	}
	public void AboutUsReadingMoreButton() throws AWTException, InterruptedException {
		
		WebElement AboutUs=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/section/div/div[2]/div/div/section/div/div/div/h2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AboutUs);
		Thread.sleep(4000);
		WebElement element3=driver.findElement(AboutUsReadMore);
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
		Thread.sleep(5000);
		element3.click();
		
	}
	public void DailySchoolSupportReadMoreButton() throws InterruptedException {
		WebElement Daily=driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/section/div/div/div/div/section/div/div/div/div[1]/section/div/div[2]/div/div/div/div/div/div/div/div/div[2]/h3/strong"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Daily);
		Thread.sleep(5000);
		driver.findElement(DailySchoolSupportReadMore).click();
	}
	public void SpecialGroupTutionReadMoreButton() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		driver.findElement(SpecialGroupTutionReadMore).click();
	}
	public void OneOnOneTutionReadMoreButton() {
		driver.findElement(OneOnOneTutionReadMore).click();
	}
	public void DailySchoolSupportRegisterNowButton() {
		WebElement DailySchool=driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/section/div/div/div/div/section/div/div[1]/div/div/section/div/div/div/h3/strong"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",DailySchool);
		driver.findElement(DailySchoolSupportRegisterNow).click();
	}
	public void SpecialGroupTutionRegisterNowButton() {
		driver.findElement(SpecialGroupTutionRegisterNow).click();
	}
	public void OneOnOneTutionRegisterNowButton () {
		driver.findElement(OneOnOneTutionRegisterNow).click();
		
	}
	
	 
	 
	
}
