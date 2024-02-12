import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.SelectMenuPage;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDemoTest {
    @Test
    void demo1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/select-menu");
        SelectMenuPage selectMenuPage = new SelectMenuPage();
        WebElementHelper webElementHelper = new WebElementHelper();
        webElementHelper.selectByText(selectMenuPage.oldStyleSelect, "Green");

        List<String> list2 = webElementHelper.getAllDropDownValue(selectMenuPage.oldStyleSelect);
        list2.forEach(System.out::println);
    }


}
