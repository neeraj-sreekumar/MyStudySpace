package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
	private WebDriver driver;
	private final String Url="https://mystudyspace.in/";
	
	private By StudySpaceIcon=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[1]/div/figure/a/img");
	private By Home=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]");
	private By AboutUs=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a");
	private By Services=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[3]");
	private By Courses=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[4]");
	private By ContactUs=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[5]");
	private By WattsApp=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[3]/div/div/a[2]");
	private By Mobileicon=By.xpath("/html/body/div[1]/div/div[1]/section/div[2]/div[3]/div/div/a[1]");
	public Header(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Navigateto() {
		driver.get(Url);
	}
	
	public void StustSpaceIcon() {
		driver.findElement(StudySpaceIcon).click();	
	}
	
	public void HomeButton() {
		driver.findElement(Home).click();
	}
	
	public void AboutUsButton() {
		driver.findElement(AboutUs).click();
	}
	
	public void ServicesButton() {
		driver.findElement(Services).click();
	}
	
	public void CoursesButton() {
		driver.findElement(Courses).click();	
	}
	
	public void ContactUsButton() {
		driver.findElement(ContactUs).click();
	}
	
	public void WattsAppButton() {
		WebElement watsapp=driver.findElement(WattsApp);
		System.out.println("Watts app icon is enabled "+watsapp.isEnabled());
	}
	
	public void PhoneButton() {
		WebElement phone=driver.findElement(Mobileicon);
		System.out.println("Phone icon is enabled "+phone.isEnabled());
		
	}
}
