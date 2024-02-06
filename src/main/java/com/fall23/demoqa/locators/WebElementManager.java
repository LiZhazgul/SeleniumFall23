package com.fall23.demoqa.locators;

import org.openqa.selenium.JavascriptExecutor;

import static com.fall23.demoqa.locators.WebDriverManager.driver;

public class WebElementManager {

   public static void scrollPageDown(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 600)");

  }
}
