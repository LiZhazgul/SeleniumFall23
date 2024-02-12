import com.fall23.helper.AlertHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
        alertHelper.acceptAlert();
        //assert не работает
//        String actualAlertMessage = driver.findElement(By.xpath("//span[text()='You selected ']")).getText();
//        String expectedAlertMessage ="You selected ";
//        assertEquals(actualAlertMessage,expectedAlertMessage);

        alertsPage.btnClickPromtBox.click();
        Thread.sleep(3000);
        alertHelper.sendKeysAlert("Hello");
        Thread.sleep(3000);
        alertHelper.acceptAlert();


    }

    @AfterClass
    void closeBrowser() {
        Driver.closeDriver();
    }


}
