package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager {

    public static WebDriver driver;
    public static WebElement element;

    public static WebDriver initChromeDriver (){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
    }

    public static void openTheSite(String URL){
        driver.get(URL);

    }

    public static WebElement findElementById (String id){
        element = driver.findElement(By.id(id));
        return element;
    }

    public static WebElement findElementByClassName (String className){
        element = driver.findElement(By.className(className));
        return element;
    }

    public static WebElement findElementByLinkedText (String link){
        element = driver.findElement(By.linkText(link));
        return  element;

    }

    public static WebElement findElementPartialText (String partialText){
        element = driver.findElement(By.partialLinkText(partialText));
        return element;
    }
}
