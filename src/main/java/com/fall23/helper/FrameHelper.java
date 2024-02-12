package com.fall23.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;


public class FrameHelper {
    private WebDriver driver;
    private WebDriverWait wait;

    public FrameHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public FrameHelper switchToFrame(WebElement element) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        return this;
    }

    public FrameHelper switchToParentFrame() {
        driver.switchTo().parentFrame();
        return this;
    }

    public FrameHelper switchByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }
}
