import com.fall23.entity.Employee;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.List;

import static com.fall23.entity.Employee.getEmployeesFromTable;

public class EmployeesTableTest {

    @Test
    void test123(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");

        List < Employee> employees = getEmployeesFromTable(driver);
        employees.forEach(System.out::println);

        int totalSalaryAmount = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        int total = 0;
        for (Employee employee : employees){
            total += employee.getSalary();
        }

        System.out.println(totalSalaryAmount);
        System.out.println(total +"total");

    }

}
