package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Main{
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
    
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
        driver.findElement(By.id("twotabsearchtextbox")).submit();
        driver.findElement(By.id("nav-cart"));
        driver.findElement(By.id("nav-cart")).click();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.close();
        driver.quit();


    }

}

