import com.fall23.helper.WindowHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.WindowsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHelperTest {
    WindowsPage windowsPage =new WindowsPage();
    WindowHelper windowHelper = new WindowHelper();
    @Test
    void test213() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/browser-windows");

        //три раза кликнет кнопку tab
        for (int i = 0; i < 5; i++) {
            windowsPage.newTabBtn.click();
            Thread.sleep(1500);
        }
        windowHelper.switchToWindow(5);
        Thread.sleep(2000);

        windowHelper.switchToParent();
        Thread.sleep(2000);

        windowHelper.switchToParentWithChildClose();
        Thread.sleep(2000);

        Driver.closeDriver();


    }
}
