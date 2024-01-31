package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.findElementByLinkedText;
import static com.fall23.WebDriverManager.openTheSite;

public class LinkedTextTest extends BaseTest {

    @Test
    void test123() throws InterruptedException {
        openTheSite("https://demoqa.com/links");

        WebElement home =findElementByLinkedText("Home");
        home.click();
        Thread.sleep(5000);
    }
}
