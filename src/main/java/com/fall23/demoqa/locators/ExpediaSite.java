package com.fall23.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.locators.WebDriverManager.openTheSite;

public class ExpediaSite extends BaseTest {
    @Test
    public void findElements() throws InterruptedException {
        openTheSite("https://www.expedia.com/");
        WebElement flightElement = driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
        Thread.sleep(5000);
    }

}
