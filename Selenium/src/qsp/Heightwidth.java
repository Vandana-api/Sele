package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

		public class Heightwidth {
			public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		 WebElement email = driver.findElement(By.id("email"));
		 int Height =email.getSize().getHeight();
		 int width =email.getSize().getWidth();
		 System.out.println("Height"+ Height);
		 System.out.println("width"+ width);
	}

}


