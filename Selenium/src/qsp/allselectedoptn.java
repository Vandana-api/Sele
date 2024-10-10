package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class allselectedoptn {

	public static void main(String[] args) throws InterruptedException {
    WebDriver d= new ChromeDriver();
    d.get("file:///C:/Users/USER/Desktop/hotel.html");
    
                WebElement slvlistbox = d.findElement(By.id("mtr"));
                Select S =new Select(slvlistbox);
                    List<WebElement> all = S.getOptions();
                    int count=all.size();
                    for (int i=0;i<count;i++)
                    {
                    	 String text = all.get(i).getText();
                    	 System.out.println(text);
                    }          
    d.quit();
	}

}
