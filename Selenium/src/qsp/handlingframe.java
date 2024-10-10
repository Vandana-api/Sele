package qsp;

import org.bouncycastle.util.Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(3000);
		
	WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	
	WebElement des1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(src1, des1).perform();
	
	WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement des2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	
	
	
	
	//div[text()='Mobile Charger']
	
	
		      
		

		}

}
