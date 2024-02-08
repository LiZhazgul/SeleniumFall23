import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxTest {

    WebDriver driver;
    CheckBoxPage checkBoxPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        checkBoxPage = new CheckBoxPage();
    }

    @Test
    void clickToBtnIcon() {
        driver.get("https://demoqa.com/checkbox");
        checkBoxPage.clickToBtnIcon(checkBoxPage.btnIconHome)
                .clickToBtnIcon(checkBoxPage.btnIconDesktop)
                .clickToBtnIcon(checkBoxPage.btnIconDocuments)
                .clickToBtnIcon(checkBoxPage.btnIconDownloads)
                .clickToCheckBox(checkBoxPage.checkBoxDesktop)
                .clickToCheckBox(checkBoxPage.checkBoxDocuments)
                .clickToCheckBox(checkBoxPage.checkBoxDownloads);
        String actualText = driver.findElement(By.cssSelector("#result")).getText();
        String expectedText = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(actualText, expectedText);
    }

    @AfterClass
    void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }


}
