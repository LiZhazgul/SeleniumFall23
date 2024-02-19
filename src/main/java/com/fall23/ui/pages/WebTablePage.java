package com.fall23.ui.pages;

import com.fall23.entity.Employee;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    private WebDriver driver;

    public WebTablePage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebTablePage fillUpTheForm(Employee employee) {
        WebElementHelper webElementHelper = new WebElementHelper();
        driver.get("https://demoqa.com/webtables");
        webElementHelper.clickCustom(driver.findElement(By.id("addNewRecordButton")));
        webElementHelper.sendKeysCustom(driver.findElement(By.id("firstName")), employee.getFirstName());
        webElementHelper.sendKeysCustom(driver.findElement(By.id("lastName")), employee.getLastName())
                .sendKeysCustom(driver.findElement(By.id("userEmail")), employee.getEmail())
                .sendKeysCustom(driver.findElement(By.id("age")),String.valueOf(employee.getAge()))
                .sendKeysCustom(driver.findElement(By.id("salary")), String.valueOf(employee.getSalary()))
                .sendKeysCustom(driver.findElement(By.id("department")), employee.getDepartment())
                .clickCustom(driver.findElement(By.id("submit")));

        return this;
    }

}
