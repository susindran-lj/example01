package com.opencartproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage {
WebDriver driver;
public AdminLoginPage(WebDriver driver) {
	this.driver = driver;
}
public void login(String user, String password) {
	driver.findElement(By.cssSelector("#input-username")).sendKeys(user);
	driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
	driver.findElement(By.cssSelector(".btn.btn-primary")).click();
}
}
