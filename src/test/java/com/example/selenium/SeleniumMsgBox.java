package com.example.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMsgBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kenti\\Documents\\dev\\chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		
		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		// Handling alert boxes
		// Click on generate alert button
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
//		driver.findElement(By.linkText("Generate Alert Box")).click();

		// Using Alert class to first switch to or focus to the alert box
		Alert alert = (Alert) driver.switchTo().alert();

		// Using accept() method to accept the alert box
		alert.accept();

		// Handling confirm box
		// Click on Generate Confirm Box
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
//		driver.findElement(By.linkText("Generate Confirm Box")).click();

		Alert confirmBox = (Alert) driver.switchTo().alert();

		// Using dismiss() command to dismiss the confirm box
		// Similarly accept can be used to accept the confirm box
		((Alert) confirmBox).dismiss();

	}

}
