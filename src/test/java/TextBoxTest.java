import com.fall23.ui.config.ConfigReader;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;
    @BeforeClass
    void setUpDriver(){
        driver= Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }
    @Test
    void fillUpTheFormPositiveTest(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Mira 23")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();

        //TODO add the assertions
    }

//    @Test
//    void checkFields(){
//        driver.get("https://demoqa.com/text-box");
//        String actualFullNameText = driver.findElement(By.id("userName")).getText();
//        Assert.assertEquals(actualFullNameText,"John Doe");
//    }
}
