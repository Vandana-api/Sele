package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlesinglelistbox {

	public static void main(String[] args) throws InterruptedException {
   WebDriver d=new ChromeDriver();
   d.get("https://www.facebook.com/");
   
   d.findElement(By.linkText("Create new account")).click();
   Thread.sleep(3000);
   WebElement DAY = d.findElement(By.id("day"));
   Select s1 =new Select(DAY);
   s1.selectByIndex(26);
   Thread.sleep(3000);
   
   
   WebElement year = d.findElement(By.id("year"));
   Select s2 =new Select(year);
   s2.selectByValue("1999");
   Thread.sleep(3000);
   
    WebElement month = d.findElement(By.id("month"));
      Select s3 =new Select(month);
      s3.selectByVisibleText("Jan");
      Thread.sleep(3000);
      
     
	}

}
