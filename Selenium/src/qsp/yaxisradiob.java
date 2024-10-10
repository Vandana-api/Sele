package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yaxisradiob {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 
		 String y = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");

		 String font =driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		 String fontsize =  driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		 System.out.println(font);
		 System.out.println(fontsize);

	}

}
