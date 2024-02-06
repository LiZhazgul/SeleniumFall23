package com.fall23.demoqa.locators.waits;

import com.fall23.demoqa.locators.BaseTest;
import com.fall23.demoqa.locators.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitExamples extends BaseTest {
    @Test
    void waitForElementToBeClickAble() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/dynamic-properties");

        WebElement willEnableAfter5SecondBtn =driver.findElement(By.id("enableAfter"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(willEnableAfter5SecondBtn)).click();


        WebElement visibleAfter5SecBtn = driver.findElement(By.id("visibleAfter"));
        wait.until(ExpectedConditions.visibilityOf(visibleAfter5SecBtn)).click();


        WebElement dangerColor = driver.findElement(By.id("colorChange"));
        wait.until(ExpectedConditions.attributeContains(dangerColor,"class","danger"));
        System.out.println(dangerColor.getAttribute("class"));
        Thread.sleep(5000);
    }


}
