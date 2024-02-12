import com.fall23.helper.AlertHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTest {
    WebDriver driver;
    AlertHelper alertHelper;
    AlertsPage alertsPage;


    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        alertHelper = new AlertHelper();
        alertsPage = new AlertsPage();
    }

    @Test
    void clickAndAcceptTest() throws InterruptedException {

        driver.get("https://demoqa.com/alerts");
        alertsPage.clickBtnToSeeAlert.click();
        Thread.sleep(2000);
        alertHelper.acceptAlert();
        Thread.sleep(2000);
        alertsPage.btnClickAfterSec.click();
        Thread.sleep(6000);
        alertHelper.acceptAlert();
        alertsPage.btnClickConfirmBox.click();
        Thread.sleep(2000);
        alertHelper.dismissAlert();
        Thread.sleep(2000);
        //assert не работает

        assertTrue(alertsPage.confirmResult.getText().contains("Cancel"));
        Thread.sleep(2000);


        alertsPage.btnClickPromtBox.click();
        Thread.sleep(3000);
        alertHelper.sendKeysAlert("Hello");
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        assertTrue(alertsPage.promtResult.getText().contains("Hello"));
        Thread.sleep(4000);


    }

    @AfterClass
    void closeBrowser() {
        Driver.closeDriver();
    }


}
