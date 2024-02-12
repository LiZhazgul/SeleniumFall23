import com.fall23.helper.FrameHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.FramePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FrameTest {
    WebDriver driver =Driver.getDriver();
    FrameHelper frameHelper= new FrameHelper(driver);
    FramePage framePage = new FramePage();
    @Test
    void frame1Test () throws InterruptedException {
        driver.get("https://demoqa.com/frames");
        frameHelper.switchToFrame(framePage.frame1);
        Assert.assertTrue(framePage.textElement.getText().contains("This is a sample page"));
        Thread.sleep(3000);
    }

    @Test
    public void frame2Test(){
        driver.get("https://demoqa.com/frames");
        frameHelper.switchByIndex(2);
        System.out.println(framePage.textElement.getText());
    }
    @AfterClass
    void closeBrow(){
        Driver.closeDriver();
    }
}
