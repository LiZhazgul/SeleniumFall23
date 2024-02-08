package com.fall23.demoqa.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.fall23.demoqa.locators.WebDriverManager.openTheSite;

public class DownloadFileTest extends BaseTest {
    @Test
    void downloadTest() throws InterruptedException {
        openTheSite("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\User\\Desktop\\Zhazgul\\file1.doc");
        Thread.sleep(5000);

    }
}
















