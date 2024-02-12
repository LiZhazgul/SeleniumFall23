import com.fall23.helper.AlertHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.AlertsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertTest {
    WebDriver driver;
    AlertHelper alertHelper;
    AlertsPage alertsPage;

    @BeforeClass
    void setUpDriver(){
        driver = Driver.getDriver();
        alertHelper = new AlertHelper();
        alertsPage = new AlertsPage();
    }

    @Test
    void test123(){

        driver.get("https://demoqa.com/alerts");
        alertsPage.btnClickConfirmBox.click();
        alertHelper.acceptAlert();


    }
}
