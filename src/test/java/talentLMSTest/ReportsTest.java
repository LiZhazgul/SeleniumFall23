package talentLMSTest;

import com.fall23.helper.WebElementHelper;
import com.fall23.helper.WindowHelper;
import com.fall23.talentLMS.page.ReportsPage;
import com.fall23.talentLMS.page.TrainingMatrixPage;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ReportsTest {

    TrainingMatrixPage trainingMatrixPage = new TrainingMatrixPage();
    ReportsPage reportsPage = new ReportsPage();
    WebDriver driver = Driver.getDriver();
    WebElementHelper helper = new WebElementHelper();


    @BeforeTest(description = "Login")
    public void login() throws InterruptedException {
        driver.get("https://zhazgulfall2023.talentlms.com/dashboard");
        WebElement loginElement = driver.findElement(By.xpath("//*[@name='login']"));
        loginElement.sendKeys("miracle.world@mail.ru");
        Thread.sleep(2000);
        WebElement passwordElement = driver.findElement(By.xpath("//*[@name='password']"));
        passwordElement.sendKeys("Zhazgul9");
        Thread.sleep(2000);
        WebElement submitBtn = driver.findElement(By.xpath("//*[@name='submit']"));
        submitBtn.click();
        Thread.sleep(2000);

    }

    @Test(description = "Reports page main")
    public void reportsPage() throws InterruptedException {

        helper.clickCustom(reportsPage.reportsLink);
        Thread.sleep(2000);


    }

    @Test(description = "Infographics click and assert")
    public void infographicsClick() throws InterruptedException {
        reportsPage.infographics.click();
        String actualText = driver.findElement(By.id("tl-infographic-custom-headtitle-1")).getText();
        assertEquals(actualText, "Your training infographic".toUpperCase());
        Thread.sleep(2000);
    }

    @Test(description = "Training matrix and asserts")
    public void trainingMatrix() throws InterruptedException {
        reportsPage.trainingMatrix.click();
        List<WebElement> elements = driver.findElements(By.xpath("//tr[@role='row']//child::th/div/span/span"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(2000);
            element.click();
            Thread.sleep(2000);
        }

        WindowHelper windowHelper = new WindowHelper();
        windowHelper.switchToParentWithChildClose();


    }
}
