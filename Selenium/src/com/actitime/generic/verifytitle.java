package com.actitime.generic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class verifytitle {

    @Test
    
    public void verifytitle() {
   	 WebDriver d=new ChromeDriver();
   	 d.get("http://localhost/login.do");
   	 d.findElement(By.id("username")).sendKeys("admin");
   	 d.findElement(By.name("pwd")).sendKeys("manager");
   	 d.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
   	        String etitle ="actiTIME - Enter Time-Track";
   	     String atitle =d.getTitle();
   	     System.out.println(atitle);
   	     SoftAssert s=new SoftAssert();
   	     s.assertEquals(etitle, atitle);
   	     d.quit();
   	     s.assertAll();
   	        
    }
}