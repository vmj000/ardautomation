package com.easy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
 


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import org.junit.Assert;


public class OpenGoogle {
  public static void main(String[] args) throws Exception {
     String expath = "C:\\IEDriverServer\\IEDriverServer.exe";

     System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer\\IEDriverServer.exe");
    // Create an instance of the driver
    WebDriver driver = new InternetExplorerDriver();// Navigate to a web page// Navigate to a web page 
 driver.get("http://www.phptravels.net/account");  // Perform actions on HTML elements, entering text and submitting the form 
 WebElement usernameElement     = driver.findElement(By.name("username"));
    WebElement passwordElement     = driver.findElement(By.name("password"));
   WebElement formElement        = driver.findElement(By.id("loginfrm"));    
    usernameElement.sendKeys("user@phptravels.com");
    passwordElement.sendKeys("demouser");
    //formElement.submit(); 
    formElement.sendKeys(Keys.ENTER);  //passwordElement.submit(); // submit by text input element
   // formElement.submit();        // submit by form element    
    System.out.println("Login done!!!");
    
   }
 }  