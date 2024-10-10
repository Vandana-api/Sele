package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cancelbuttontext {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	 d.switchTo().alert().dismiss();

		boolean text = d.findElement(By.xpath("//p[@id='demo']")).isDisplayed();

		if(text==true) {
			System.out.println(" it is displaying ");
		}
		else {

			System.out.println(" it is not  displaying ");
		}
d.quit();
	}
}