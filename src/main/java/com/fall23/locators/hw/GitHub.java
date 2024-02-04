package com.fall23.locators.hw;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class GitHub extends BaseTest {
    @Test

    public  void gitHub() throws InterruptedException {
        openTheSite("https://www.w3schools.com/");

        WebElement seleniumTab = driver.findElement(By.xpath("//a[@class='ga-nav subtopnav_firstitem']"));
        seleniumTab.click();
        Thread.sleep(5000);
    }
}
