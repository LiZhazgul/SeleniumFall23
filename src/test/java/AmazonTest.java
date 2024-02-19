import com.fall23.helper.BrowserManager;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.SelectMenuPage;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AmazonTest {

    @Test
    public void test123() throws InterruptedException {

        WebElementHelper helper = new WebElementHelper();
        WebDriver driver = Driver.getDriver();
        BrowserManager browserManager = new BrowserManager(driver);
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        browserManager.refreshThePage();
        Thread.sleep(5000);
        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("iphone", Keys.ENTER);

        List<WebElement> brandslist = driver.findElements(By.xpath("//li[starts-with(@id,'p_89')]/span/a/div/label/i"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < brandslist.size(); i++) {
            WebElement brand = brandslist.get(i);
            try {
                js.executeScript("arguments[0].scrollIntoView(true);", brand);
                Thread.sleep(1000);
                brand.click();
                Thread.sleep(2000);
            } catch (StaleElementReferenceException e) {
                // Повторное получение списка элементов
                brandslist = driver.findElements(By.xpath("//li[starts-with(@id,'p_89')]/span/a/div/label/i"));
                // Обработка ошибки
                System.out.println("Элемент устарел. Повторно получен список.");
                // Уменьшение счетчика, чтобы обработать этот же элемент еще раз
                i--;
            }

        }
    }
}
