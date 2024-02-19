package demoqaTest;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.RadioButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RadioButtonTest {
    WebDriver driver;
    RadioButtonPage radioButtonPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        radioButtonPage = new RadioButtonPage();
    }

    @Test
    void clickRadioBtns() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickYesBtn();
        String actualYesText = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
        assertEquals(actualYesText, "You have selected Yes");
        Thread.sleep(3000);
        radioButtonPage.clickImpressiveBtn();
        String actImprText = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
        assertEquals(actImprText, "You have selected Impressive");
        Thread.sleep(3000);
        radioButtonPage.clickNoBtn();
    }

    @AfterClass
    void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
