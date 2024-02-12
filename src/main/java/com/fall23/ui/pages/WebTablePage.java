package com.fall23.ui.pages;

import com.fall23.entity.Employee;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    private WebDriver driver;

    public WebTablePage  (WebDriver driver){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

//    public WebTablePage fillUpTheForm (Employee employee){
//        driver.get("https://demoqa.com/webtables");
//
//    }

}
