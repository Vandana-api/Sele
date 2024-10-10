package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class hwacti 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement un = driver.findElement(By.id("username"));
		int H1 =un.getSize().getHeight();
		int w1 =un.getSize().getWidth();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int H2 =pwd.getSize().getHeight();
		int w2 =pwd.getSize().getWidth();

	if((H1&w1)==(H2&w2))
			{
		System.out.println("it is equal");
			}
	else {
		System.out.println("it is not  equal");
	}
	}
}
