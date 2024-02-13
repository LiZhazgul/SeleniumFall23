import com.fall23.helper.WindowHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.WindowsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class WindowHelperTest {
    WindowsPage windowsPage = new WindowsPage();
    WindowHelper windowHelper = new WindowHelper();
    WebDriver driver = Driver.getDriver();

    @Test
    void test213() throws InterruptedException {

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

    }

    @Test
    public void secondBtn() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        for (int i = 0; i < 2; i++) {
            windowsPage.newWindowBtn.click();
            Thread.sleep(2000);
        }
        windowHelper.switchToParentWithChildClose();
    }

    @Test
    public void thirdBtn() {
        driver.get("https://demoqa.com/browser-windows");
        windowsPage.newWindowMsgBtn.click();
        windowHelper.switchToParentWithChildClose();
    }

    @AfterClass
    public void browClose() {
        Driver.closeDriver();
    }

}
