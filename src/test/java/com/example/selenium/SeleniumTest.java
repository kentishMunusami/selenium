package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kenti\\Documents\\dev\\chromedriver_win32\\chromedriver.exe");

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        WebDriver driver =  new ChromeDriver(options); 
//        driver.get("https://accounts.google.com/signin");
//        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("kentish.munusami@capfi.fr");
//        driver.findElement(By.id("identifierNext")).click();
//        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("Marseille93240");
//        driver.findElement(By.id("passwordNext")).click();
		
//		WebDriver driver=new ChromeDriver(); 
//	    driver.get("http://localhost:4200/#/login");
//	    driver.findElement(By.id("mat-input-0")).sendKeys("kentish.munusami@capfi.fr");
//	    driver.findElement(By.id("mat-input-1")).sendKeys("admin");  
//	    driver.findElement(By.name("connecter")).click();
//	    driver.close();	
		
	       // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();     
		
		                  
		

	    
	}

}
