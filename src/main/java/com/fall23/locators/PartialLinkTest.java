package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.findElementPartialText;
import static com.fall23.WebDriverManager.openTheSite;

public class PartialLinkTest extends BaseTest {
    @Test
    void demo() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement unauth = findElementPartialText("Unauth");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        unauth.click();
        Thread.sleep(5000);
    }
}
