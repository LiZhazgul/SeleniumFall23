import com.fall23.helper.AlertHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertTest {
    WebDriver driver;
    AlertHelper alertHelper;

    @BeforeClass
    void setUpDriver(){
        driver = Driver.getDriver();
        alertHelper = new AlertHelper();
    }

    @Test
    void test123(){

        driver.get("https://demoqa.com/alerts");
        WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
        confirmBtn.click();

        AlertHelper alertHelper =new AlertHelper();
        alertHelper.acceptAlert();


    }
}
