package com.fall23.demoqa.locators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.locators.WebDriverManager.findElementById;
import static com.fall23.demoqa.locators.WebDriverManager.openTheSite;

public class ByID extends BaseTest {
    @Test
    void byIdTest(){
        openTheSite("https://demoqa.com/text-box");

        //WebElement usernameInput = driver.findElement(By.id("userName"));
        WebElement usernameInput =findElementById("userName");
        WebElement emailInput = findElementById("userEmail");
        WebElement currentAddressInput = findElementById("currentAddress");
        WebElement permanentAddressInput = findElementById("permanentAddress");
        WebElement submitBtn = findElementById("submit");

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovetskaya 123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();




    }



}
