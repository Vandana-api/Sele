package qsp;

import org.bouncycastle.util.Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nestedframes1 {

	public static void main(String[] args) throws InterruptedException {
     WebDriver d=new ChromeDriver();
     d.get("https://demoapps.qspiders.com/");
    d.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();	Thread.sleep(3000);	
    d.findElement(By.xpath("//section[text()='Frames']")).click();Thread.sleep(3000);	
    d.findElement(By.xpath("//section[text()='iframes']")).click();Thread.sleep(3000);
    d.findElement(By.xpath("//a[text()='Nested iframe']")).click();Thread.sleep(3000);
    
    
  WebElement p1 = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
    d.switchTo().frame(p1);
    
    d.findElement(By.xpath("//p[text()='Admin@gmail.com']")).sendKeys(Keys.CONTROL+"ac");
    Thread.sleep(3000);
    
    d.switchTo().frame(1);
    d.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL+"av");
    
    
    
    
    
    
    
    
    
	}
	 
}
