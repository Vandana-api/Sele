package qsp;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/"); 
		Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,\"imageSlideContainer\")]")).click();
		driver.findElement(By.xpath("//span[@class=\"lbl_input appendBottom10\"]")).click();
		Thread.sleep(3000);
		
		WebElement fromlist = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));Thread.sleep(3000);
		
		Select s=new Select(fromlist);
		
		s.get()

		driver.findElement(By.xpath("(//div[@class=\"makeFlex column flexOne appendRight10\"])[4]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"][2]")).click();

		WebElement tolist =	driver.findElement(By.xpath("//input[@placeholder=\"To\"]"));Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class=\"font14 appendBottom5 blackText\"])[9]")).click();
        driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label=\"Thu Sep 05 2024\"]")).click();Thread.sleep(3000);
		//driver.findElement(By.xpath("

		driver.quit();


	}
}