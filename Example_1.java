package alert_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {

	public static void main(String[] args) {
		  
				String text = "Suraj";
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				
				driver.findElement(By.id("name")).sendKeys(text);
				driver.findElement(By.xpath("//input[@id = 'alertbtn']")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();    //for clicking on OK/YES button



	}

}
