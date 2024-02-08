package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

    public AlertsPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#alertButton")
    public WebElement clickBtnToSeeAlert;

    @FindBy(css = "#timerAlertButton")
    public WebElement btnClickAfterSec;

    @FindBy(css = "#confirmButton")
    public WebElement btnClickConfirmBox;

    @FindBy(css = "#promtButton")
    public WebElement btnClickPromtBox;


}