import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ButtonsTest {
    WebDriver driver;
    ButtonsPage buttonsPage;

    @BeforeClass
    void setUpBrowser() {
        driver = Driver.getDriver();
        buttonsPage = new ButtonsPage();
    }

    @AfterClass
    void closeBrowser() {
        Driver.closeDriver();
    }

    @Test
    void BtnTests() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        buttonsPage.clickDoubleBtn();
        String actualDoubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        assertEquals(actualDoubleClickMessage, "You have done a double click");
        Thread.sleep(5000);
        buttonsPage.clickRightBtn();
        String actualrightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
        assertEquals(actualrightClickMessage, "You have done a right click");
        Thread.sleep(3000);
        buttonsPage.dynamicClickBtn();
        String actualDynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
        assertEquals(actualDynamicClickMessage, "You have done a dynamic click");
        Thread.sleep(3000);


    }
}
