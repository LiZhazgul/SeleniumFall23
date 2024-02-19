package com.fall23.talentLMS.page;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrainingMatrixPage {
    WebDriver driver = Driver.getDriver();


    public TrainingMatrixPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void listOfAllElements(){
        List<WebElement> elements =driver.findElements(By.xpath("//tr[@role='row']"));
        for (WebElement element : elements){
            element.click();
        }

    }


}
