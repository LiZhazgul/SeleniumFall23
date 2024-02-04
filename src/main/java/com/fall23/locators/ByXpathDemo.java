package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class ByXpathDemo extends BaseTest {
    @Test
    void demo() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");

        ///html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input

        WebElement fullNameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullNameInput.sendKeys("John Doe");
        Thread.sleep(5000);
    }
@Test
void  orangeHRM_login() throws InterruptedException {
        openTheSite("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usernameInputField = driver.findElement(By.xpath("//input[@name='username']"));
        usernameInputField.sendKeys("Admin");
        WebElement passwordInputField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInputField.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.xpath("//button"));
        loginBtn.click();

        WebElement adminTab = driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']/child::span"));
        adminTab.click();
        Thread.sleep(10000);




}


}
