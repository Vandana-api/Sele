package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
        WebDriver d =new ChromeDriver();
        d.get("https://www.google.com/");
        TakesScreenshot T= (TakesScreenshot) d;
			File src=T.getScreenshotAs(OutputType.FILE);
			 File dst=new File("./screenshot/ss.png");
			 FileUtils.copyFile(src, dst);
			 d.quit();
        
	
	}

}
