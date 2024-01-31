package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLoginTest {
    WebDriver driver = new ChromeDriver();

    @BeforeClass(description = "Open the website")
    void openTheWebsite() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe ");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(description = "Login with valid username and valid password")
    void loginWithValidUserNameAndValidPasswordTest (){

        String actualLoginText =driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText ="Login";
        Assert.assertEquals(actualLoginText,expectedLoginText);

        String username = "Admin";
        String password = "admin123";


        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText,expectedDashboardText);

    }

        @Test (description = "Login with valid username and invalid password", priority = 1)
        public void loginWithValidUserAndInvalidPassTest(){

            String username = "Admin";
            String password = "Admin123";

            WebElement usernameInputField = driver.findElement(By.name("username"));
            WebElement passwordInputField = driver.findElement(By.name("password"));

            usernameInputField.sendKeys(username);
            passwordInputField.sendKeys(password);

            WebElement loginBtn = driver.findElement(By.tagName("button"));
            loginBtn.click();

            String actualErrorText = driver.findElement(By.tagName("p")).getText();
            String expectedErrorText = "Invalid credentials";
            Assert.assertEquals(actualErrorText,expectedErrorText);

        }

        @Test (description = "Login with invalid username and valid password", priority = 2)
    void loginWithInvalidUsernameAndValidPassword (){
            String username = "zhazgul";
            String password = "admin123";

            WebElement usernameInputField = driver.findElement(By.name("username"));
            WebElement passwordInputField = driver.findElement(By.name("password"));

            usernameInputField.sendKeys(username);
            passwordInputField.sendKeys(password);

            WebElement loginBtn = driver.findElement(By.tagName("button"));
            loginBtn.click();

            String actualErrorText = driver.findElement(By.tagName("p")).getText();
            String expectedErrorText = "Invalid credentials";
            Assert.assertEquals(actualErrorText,expectedErrorText);

        }
//        @Test (description = "Forgot password button",priority = 3)
//    void forgotPassword (){
//
//
//            WebElement forgotPasswordBtn = driver.findElement(By.xpath("//p[@class<p class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\" ]"));
//            forgotPasswordBtn.click();
//
//            String actualResetPasswordText = driver.findElement(By.tagName("h6")).getText();
//            String expectedResetPasswordText ="Reset Password";
//            Assert.assertEquals(actualResetPasswordText,expectedResetPasswordText);
//
//            String username = "Admin";
//            WebElement usernameInputField = driver.findElement(By.name("username"));
//            usernameInputField.sendKeys(username);
//
//            WebElement resetPasswordBtn = driver.findElement(By.tagName("button"));
//            resetPasswordBtn.click();
//
//            String actualResetPasswordLinkSentSuccessfully = driver.findElement(By.tagName("h6")).getText();
//            String expectedResetPasswordLinkSentSuccessfully = "Reset Password link sent successfully";
//            Assert.assertEquals(actualResetPasswordLinkSentSuccessfully,expectedResetPasswordLinkSentSuccessfully);
//
//        }
//        @AfterClass (description = "close the browser")
//    public void closeBrowser(){
//        driver.close();
//        }





    }

