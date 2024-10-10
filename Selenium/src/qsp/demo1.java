package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
 WebDriver driver  =   new ChromeDriver();
 driver.get("https://www.google.com/");
           driver.findElement(By.id("APjFqb")).sendKeys("java");
//           =driver.findElements(By.xpath(""))
           
           
          
           
 
	
	}

}
