package com.fall23;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.fall23.WebDriverManager.driver;

public class WebElementManager {

   public static void scrollPageDown(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 600)");

  }
}
