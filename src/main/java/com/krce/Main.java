package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
        driver.get("https://demo.opencart.com ");

        driver.findElement(By.id("input-email")).sendKeys("santhsharvini7@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Shar@123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebElement LoginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginMessage")));

        driver.quit();

    }
}