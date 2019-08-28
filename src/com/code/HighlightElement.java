package com.code;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightElement {

	public static void main(String[] args) {
		
     //  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		//driver.findElement(By.className("//button[@class='btn btn-primary btn-block btn-flat']")).click();
		
		WebElement loginbtn =driver.findElement(By.className("//button[@class='btn btn-primary btn-block btn-flat']"));
		flash(loginbtn,driver);
	}
		
		public static void flash(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js =((JavascriptExecutor) driver);
			String bgcolor = element.getCssValue("bagroundColor");
			for(int i=0; i<10; i++){
				changeColor("rgb(0,200,0)",element,driver);
				changeColor("bgcolor",element,driver);
				
			}}
			private static void changeColor(String color, WebElement element, WebDriver driver) {
				// TODO Auto-generated method stub
				JavascriptExecutor js =((JavascriptExecutor) driver);
				js.executeScript("argument[0].style.bagroundColor= '"+color+"'",element);
				try{
					Thread.sleep(20);
					
				}
				catch(InterruptedException e){
					
				}
			
		}
}
		
		
		
		
		
		
		
		
