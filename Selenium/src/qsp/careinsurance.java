package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class careinsurance {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("123");
		d.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement monthlist = d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(monthlist);
		s.selectByIndex(9);
		
		WebElement year = d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(year);
		s1.selectByValue("1999");
		
		d.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("1234567890");
		
		d.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		
		
		boolean res =d.findElement(By.xpath("//span[@id='policynumberError']")).isDisplayed();
		
		if(res==true) {
			System.out.println(" correct");
		}
		else {
			System.out.println(" wrong");
		}
	}
}
