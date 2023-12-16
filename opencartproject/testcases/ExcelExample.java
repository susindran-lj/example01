package com.opencartproject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelExample {
  @Test(dataProvider="testdata")
  public void demoClass(String username, String password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "Path of Chrome Driver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.browserstack.com/users/sign_in</a>");
	  driver.findElement(By.name("user[login]")).sendKeys(username);
	  driver.findElement(By.name("user[password]")).sendKeys(password);
	  driver.findElement(By.name("commit")).click();
	  Thread.sleep(5000);
	  Assert.assertTrue(driver.getTitle().matches("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid credentials");
	  System.out.println("Login successful");
	  }
 
}
