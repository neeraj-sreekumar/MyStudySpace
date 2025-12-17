package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicesPage {
	private WebDriver driver;
	private final String urls="https://mystudyspace.in/services/";
	
	private By DailySchoolSuppoertRegrNow=By.xpath("/html/body/div[1]/div/div[4]/section/div/div/div/div/section/div/div[1]/div/div/section/div/div/div/div[3]/a");
	private By SpecialGroupTutionRegNow=By.xpath("/html/body/div[1]/div/div[4]/section/div/div/div/div/section/div/div[2]/div/div/section/div/div/div/div[3]/a");
	private By OneonOneTutionReg=By.xpath("/html/body/div[1]/div/div[4]/section/div/div/div/div/section/div/div[2]/div/div/section/div/div/div/div[3]/a");
	
	
	public void NavigateTo() {
		driver.get(urls);
	}
	
	
	
	public ServicesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void DailySchoolSupportRegisterNowButton() throws InterruptedException {
		WebElement ourpricing=driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/section/div/div/div/h2"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView();",ourpricing);
		  Thread.sleep(5000);
		  driver.findElement(DailySchoolSuppoertRegrNow).click();
	
	}
	
	public void SpecialGroupTutionRegisterNowButton() {
		driver.findElement(SpecialGroupTutionRegNow).click();
	}
	
	
	public void OneOnONeTutionRegisterNowButton() {
		driver.findElement(OneonOneTutionReg).click();
	}
	

}
