package demoqaTest;

import com.fall23.helper.WindowHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.WindowsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Set;

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
    @Test
    public void childWindowTextAssert() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent window -" + parentHandle);
        windowsPage.newWindowMsgBtn.click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles){
            System.out.println("handle -" +handle);
            if (!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                ///html/body
                WebElement text = driver.findElement(By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']"));
                String act =text.getText();
                Assert.assertEquals(act,"Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(parentHandle);
        windowsPage.newWindowBtn.click();
        Thread.sleep(2000);
        driver.quit();
    }


    @AfterClass
    public void browClose() {
        Driver.closeDriver();
    }

}
