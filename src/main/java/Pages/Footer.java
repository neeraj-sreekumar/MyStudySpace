package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {
	private WebDriver driver;
	private final String url="https://mystudyspace.in/";
	
	private By Aboutus=By.xpath("/html/body/div[1]/div/div[8]/section/div[2]/div/div/div[1]/section/div/div[2]/div/div[1]/div/div[1]/a/span");
	private By Services=By.id("guten-54WsEa");
	private By Courses=By.id("guten-maMhGJ");
	private By Contactus=By.id("guten-Gbe1vA");
	private By CBSE=By.id("guten-UTo7Kv");
	private By HSE=By.id("guten-pIaTXi");
	private By Facebook=By.id("guten-FNAMPk");
	private By Instagram=By.id("guten-jMT5g8");
	private By Youtube=By.id("guten-lLbrox");
	private By Enquirenow=By.xpath("/html/body/div[1]/div/div[8]/section/div[2]/div/div/div[1]/section/div/div[4]/div/div[2]/a/span");
	
	public Footer(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Navigateto() {
		driver.get(url);
	}
	
	public void AboutUs() {
		driver.findElement(Aboutus).click();
	}
	
	public void Services() {
		driver.findElement(Services).click();
	}
	
	public void Courses() {
		driver.findElement(Courses).click();
	}
	
	public void ContactUs() {
		driver.findElement(Contactus).click();
	}
	
	public void Facebook() {
		driver.findElement(Facebook).click();
	}
	
	public void Instagaram() {
		driver.findElement(Instagram).click();
	}
	
	public void YouTube() {
		driver.findElement(Youtube).click();
	}
	
	public void Cbse() {
		driver.findElement(CBSE).click();
	}
	
	public void Hse() {
		driver.findElement(HSE).click();
	}
	
	public void Enqiure() {
		driver.findElement(Enquirenow).click();
	}
	
	

}
