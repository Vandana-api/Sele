package qsp;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class hidden_division {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui"); 

		driver.findElement(By.xpath("//section[.='Popups']")).click(); 
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
			Thread.sleep(2000)	;
			
			driver.findElement(By.xpath("//input[(@type='text')])[1]")).sendKeys("vandana")	;
			driver.findElement(By.xpath("//div//input[@type='email')][1]")).sendKeys("vandu@1234");
			WebElement prrolist = driver.findElement(By.xpath("(//select)[2]"));
			
			Select s=new Select(prrolist);
			s.selectByIndex(1);
			driver.findElement(By.xpath("//div//textarea")).sendKeys("hidden division");
			driver.findElement(By.xpath("//button[@type='submit']"));
	}
}
