package demoqaTest;

import com.fall23.ui.config.ConfigReader;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }

    @Test
    void fillUpTheFormPositiveTest() {
        driver.get("https://demoqa.com/text-box");
        //метод chaining
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Mira 23")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();
        //TODO add the assertions

        String actualFullNameText = driver.findElement(By.cssSelector("#name")).getText();
        assertEquals(actualFullNameText, "Name:John Doe");
        String actualEmailText = driver.findElement(By.cssSelector("#email")).getText();
        assertEquals(actualEmailText, "Email:john@gmail.com");
        String actualCurrentAddressText = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
        assertEquals(actualCurrentAddressText, "Current Address :Mira 23");
        String actualPermanentAddressText = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
        assertEquals(actualPermanentAddressText, "Permananet Address :Sovet 321");

    }



    @AfterClass
    void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }

    @Test(description = "Negative: Заполнение поля email некорректным значением")
    void fillUpEmailWithIncorrectValue(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("joinsdfv@g")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();

        assertEquals(textBoxPage.emailInput.getAttribute("class"),"mr-sm-2 field-error form-control");
    }

//@Test(description = "Орфографическая ошибка,permanent address")
//    void checkForSpellingError(){
//    driver.get("https://demoqa.com/text-box");
//    WebElement permAddEl = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
//    assertTrue(permAddEl.isDisplayed(),"Permanent address element is not displayed");
//    String actualPermanentAddressText = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
//    String expectedPermanentAddressText ="Permanent Address :Sovet 321";
//    assertEquals(actualPermanentAddressText,expectedPermanentAddressText,"Text contains a spelling error");
//}



}
