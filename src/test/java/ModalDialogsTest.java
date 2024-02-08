import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ModalDialogsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ModalDialogsTest {
    WebDriver driver;
    ModalDialogsPage modalDialogsPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        modalDialogsPage = new ModalDialogsPage();
    }

    @AfterClass
    void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    @Test
    public void smallModalTest() throws InterruptedException {
        driver.get("https://demoqa.com/modal-dialogs");
        modalDialogsPage.clickSmallBtn();
        String actualSmallText = driver.findElement(By.cssSelector(".modal-body")).getText();
        Assert.assertEquals(actualSmallText, "This is a small modal. It has very less content");
        Thread.sleep(2000);
        modalDialogsPage.clickSmallClose();
//        modalDialogsPage.clickLargeBtn();
//        String actualLargeText = driver.findElement(By.cssSelector(".modal-body")).getText();
//        Assert.assertEquals(actualLargeText,"Lorem Ipsum is simply dummy text of the printing " +
//                "and typesetting industry. Lorem Ipsum has been the industry's standard dummy text " +
//                "ever since the 1500s, when an unknown printer took a galley of type and scrambled" +
//                " it to make a type specimen book. It has survived not only five centuries, " +
//                "but also the leap into electronic typesetting, remaining essentially unchanged. " +
//                "It was popularised in the 1960s with the release of Letraset sheets containing " +
//                "Lorem Ipsum passages, and more recently with desktop publishing software like " +
//                "Aldus PageMaker including versions of Lorem Ipsum.");
//        Thread.sleep(2000);
//        modalDialogsPage.clickLargeClose();


    }
}
