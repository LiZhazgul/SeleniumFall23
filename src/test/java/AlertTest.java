import com.fall23.helper.AlertHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertTest {
    @Test
    void test123(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
        confirmBtn.click();

        AlertHelper alertHelper =new AlertHelper();
        alertHelper.acceptAlert();


    }
}
