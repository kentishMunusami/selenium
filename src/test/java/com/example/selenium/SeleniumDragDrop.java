package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragDrop {
	
	public static void main(String[] args) {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kenti\\Documents\\dev\\chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		 //WebElement on which drag and drop operation needs to be performed  
        WebElement from = driver.findElement(By.id("sourceImage"));  

    //WebElement to which the above object is dropped  
        WebElement to = driver.findElement(By.id("targetDiv"));  
           
    //Creating object of Actions class to build composite actions  
        Actions act = new Actions(driver);  
           
    //Performing the drag and drop action  
        act.dragAndDrop(from,to).build().perform();   


	}

}
