package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allsuggestion {

	public static void main(String[] args) throws InterruptedException {
         WebDriver d=new ChromeDriver();
         d.get("https://www.google.com/");
         d.findElement(By.id("APjFqb")).sendKeys("java");
         Thread.sleep(3000);
         List<WebElement> all = d.findElements(By.xpath("//span[contains(text(),'java')]"));
         int count=all.size();
         System.out.println(count);
         
         for(int i=0;i<count;i++) {
        	       String text = all.get(i).getText();
        	       System.out.println(text);
        	       
         }
         
         
         d.quit();
         
	}

}
