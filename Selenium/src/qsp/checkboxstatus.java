package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkboxstatus {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
boolean status=driver.findElement(By.id("keepLoggedInCheckBox")).isEnabled();
Thread.sleep(2000);
if(status==true) {
System.out.println("enabled ");
	}
else {
	System.out.println("not enabled ");

}
	}
}
