package alert_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_2 {

	public static void main(String[] args) {
		
		 
		String text = "Suraj";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		driver.findElement(By.cssSelector("input[id = 'name']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[id = 'confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();  //for clicking on Cancel/NO Button

	}

}
