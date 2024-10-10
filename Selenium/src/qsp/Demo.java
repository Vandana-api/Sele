package qsp;

import org.bouncycastle.util.Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");

		String tagname = driver.findElement(By.id("licenseLink")).getTagName();
		String attri = driver.findElement(By.id("licenseLink")).getAttribute("View License");
		System.out.println(tagname);
		System.out.println(attri);
		driver.quit();
	}
	
}
