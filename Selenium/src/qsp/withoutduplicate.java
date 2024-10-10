package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class withoutduplicate {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
          int count=0;
	d.get("file:///C:/Users/USER/Desktop/hotel.html");
	   WebElement mtrlistbox = d.findElement(By.id("mtr"));
	   Select s=new Select(mtrlistbox);
	  List<WebElement> alloption = s.getOptions();
	  
	  ArrayList  al=new ArrayList();
	  for (int i=0;i<alloption.size();i++) {
		  String text = alloption.get(i).getText();
		  al.add(text);
		  for(int j=i+1;j<alloption.size();j++) {
			   if(al[i].equals(al[j])) {
				   count++;
				   if(count>1) {
				   System.out.println(al[i]);
			   
		   }
	  }
	  }
	  for(Object o:al)
	  {  
		  System.out.println(o);
	  }
	  

	}

}
