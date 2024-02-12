package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeFormPage {

    public PracticeFormPage (){
    PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "react-datepicker__input-container")
    public WebElement datePickerButton;

    @FindBy (xpath = "//div/input[@id='firstName']")
    public WebElement name;

   // @FindBy ()


    public PracticeFormPage selectDateMonthYear(String dateMonthYear){
        String [] dateMonthYearParts = dateMonthYear.split(" ");
        String day =dateMonthYearParts[0];
        String month =dateMonthYearParts[1];
        String year = dateMonthYearParts[2];
        WebElementHelper webElementHelper =new WebElementHelper();
        webElementHelper.clickCustom(datePickerButton);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement monthDropDown =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));
        WebElement yearDropDown =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));





        return this;
    }



}
