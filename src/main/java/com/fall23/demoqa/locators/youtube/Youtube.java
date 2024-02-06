package com.fall23.demoqa.locators.youtube;

import com.fall23.demoqa.locators.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.fall23.demoqa.locators.WebDriverManager.openTheSite;

public class Youtube extends BaseTest {
    @Test
    public void youtube() throws InterruptedException {
        openTheSite("https://www.youtube.com/");

        WebElement searchInputField = driver.findElement(By.xpath("//input[@id='search']"));
        searchInputField.sendKeys("Billie Eilish");
        WebElement searchBtn =driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchBtn.click();
        WebElement clickVideo=driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/V1Pl8CzNzCw/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC-HQdxDUm_StH7N7qg8Nunyyt1Gw']"));
        clickVideo.click();

        String actualName =driver.findElement(By.xpath("//span[text()='Главная']")).getText();
        String expectedName ="Главная";
        Assert.assertEquals(actualName,expectedName);
        Thread.sleep(50000);


    }



}
