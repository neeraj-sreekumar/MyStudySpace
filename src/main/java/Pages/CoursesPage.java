package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CoursesPage {
	private WebDriver driver;
	private final String Url="https://mystudyspace.in/courses/";
	
	public void Navigateto() {
		driver.get(Url);
	}
	
	public CoursesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By Name= By.xpath("/html/body/div[1]/div/div[4]/section/div[2]/div/div/div/div/form/div[1]/p[1]/span/input");
	private By ParentsContactNum=By.xpath("/html/body/div[1]/div/div[4]/section/div[2]/div/div/div/div/form/div[1]/div[1]/div[1]/p/span/input");
	private By Class=By.xpath("/html/body/div[1]/div/div[4]/section/div[2]/div/div/div/div/form/div[1]/div[1]/div[2]/p/span/input");
	private By Place=By.xpath("/html/body/div[1]/div/div[4]/section/div[2]/div/div/div/div/form/div[1]/p[2]/span/input");
	private By PlaceChosen=By.xpath("/html/body/div[1]/div/div[4]/section/div[2]/div/div/div/div/form/div[1]/p[3]/span/select");
	private By Message=By.xpath("/html/body/div[1]/div/div[4]/section/div[2]/div/div/div/div/form/div[1]/p[4]/span/textarea");
	
	public void StudentName() {
		driver.findElement(Name).sendKeys("neeraj");
	}
	
	public void ParentContactNumber() {
		driver.findElement(ParentsContactNum).sendKeys("9544616105");
	}
	
	public void Class() {
		driver.findElement(Class).sendKeys("10");
	}
	
	public void Place() {
		driver.findElement(Place).sendKeys("Tvm");
	}
	
	public void PlaceChosen() {
		Select select=new Select(driver.findElement(PlaceChosen));
		select.selectByValue("Special Group Tuition");
	}
	
	public void Message() {
		driver.findElement(Message).sendKeys("i need a tution");
	}
	
}
