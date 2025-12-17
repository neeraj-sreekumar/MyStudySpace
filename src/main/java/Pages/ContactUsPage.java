package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
	private WebDriver driver;
	private final String url="https://mystudyspace.in/contact/";
	
	
	private By Name=By.id("name");
	private By Email=By.id("email");
	private By PhoneNumber=By.id("phone");
	private By Message=By.id("message");
	private By CochiContactNumber=By.id("guten-xocwEJ");
	private By CochiWattsApp=By.id("guten-JICcPn");
	private By TrivandrumContactNumber=By.id("guten-CZnGxS");
	private By TrivandrumWattsApp=By.id("guten-TWSVg4");
	
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigateTo() {
		driver.get(url);
	}
	
	public void Name() {
		driver.findElement(Name).sendKeys("neeraj");
	}
	
	public void Email() {
		driver.findElement(Email).sendKeys("neerajsreekumar@gmail.com");
		
	}
	
	public void Number() {
		driver.findElement(PhoneNumber).sendKeys("9544616105");
	}
	
	public void Message() {
		driver.findElement(Message).sendKeys("i am neeraj");
	}
	
	public void CochinContact() {
	WebElement CochiCont=driver.findElement(CochiContactNumber);
		System.out.println("Cochi contact number is enabled " +CochiCont.isEnabled());
		
	}
	
	public void CochinWattsApp() {
		WebElement cochiWataapp=driver.findElement(CochiWattsApp);
		System.out.println("cochi wattsapp number is enabled " +cochiWataapp.isEnabled());
	}
	
	public void TrivandrumContact() {
		WebElement TrivandrumCont=driver.findElement(TrivandrumContactNumber);
		System.out.println("Trivandrum contact number is enabled "+TrivandrumCont.isEnabled());
	}
	
	public void TrivandrumWattsApp() {
		WebElement TriWattsapp=driver.findElement(TrivandrumWattsApp);
				System.out.println("Trivandrum wattsapp number is enabled "+TriWattsapp.isEnabled());		
	}

}
