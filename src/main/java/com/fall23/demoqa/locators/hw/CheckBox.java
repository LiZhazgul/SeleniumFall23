package com.fall23.demoqa.locators.hw;

import com.fall23.demoqa.locators.BaseTest;
import com.fall23.demoqa.locators.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends BaseTest {
    @Test
    void checkBox() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/checkbox");

        WebElement homeCheckBox = driver.findElement(By.cssSelector(".rct-collapse-btn"));
        homeCheckBox.click();
        Thread.sleep(3000);
        WebElement desktopCheckBox = driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > button > svg"));
        desktopCheckBox.click();
        Thread.sleep(5000);

        WebElement desktopCheck =driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        desktopCheck.click();
        Thread.sleep(3000);

        String actualDesktopText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualDesktopText,"You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");







    }
}
