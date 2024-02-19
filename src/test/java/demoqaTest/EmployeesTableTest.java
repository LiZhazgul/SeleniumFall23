package demoqaTest;

import com.fall23.data.JavaFaker;
import com.fall23.entity.Employee;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.WebTablePage;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.List;

import static com.fall23.entity.Employee.getEmployeesFromTable;
@Epic("WebTAble")//ok
public class EmployeesTableTest {

    @Test
    @Feature("Demoqa webTable")//ok
    @AllureId("123")//no
    @Description ("Verify all employee in WebTable")//ok
    @Flaky//depends from functionality
    @Issue("Can not save the data")//nols

    @Owner("Zhazgul")//ok
    @Severity(SeverityLevel.CRITICAL)//ok
    @Story("TL-001")//ok
    @TmsLink("")// ссылка на тест кейс// no
    @Tag("Smoke")// ok

    void test123(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");

        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.fillUpTheForm(randomEmployee);


        List < Employee> employees = getEmployeesFromTable(driver);
        employees.forEach(System.out::println);

        //Первый вариант суммы!!!
        //через Stream API сумму зарплаты,stream перебирает под капотом, открывает поток
//        int totalSalaryAmount = employees.stream()
//                //mapToInt -->переобразовывает в integer
//                .mapToInt(Employee::getSalary)
//                //сумма
//                .sum();
//
//
//        //Второй вариант суммы!!!
//        int total = 0;
//        for (Employee employee : employees){
//            total += employee.getSalary();
//        }
//        System.out.println(totalSalaryAmount);
//        System.out.println(total +"total");
    }

    //TODO verify all employees data


}
