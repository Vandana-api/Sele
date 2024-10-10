package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingalertpopup {

	public static void main(String[] args) {
      WebDriver d=new ChromeDriver();
      d.get("https://demo.automationtesting.in/Alerts.html");
      d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
      WebDriverWait wait =new WebDriverWait(d,Duration.ofSeconds(20));
      wait.until(ExpectedConditions.alertIsPresent());
      
      Alert a = d.switchTo().alert();
      
     String text = a.getText();
     
     a.dismiss();
     System.out.println(text);
      
      
      
      
	}

}
