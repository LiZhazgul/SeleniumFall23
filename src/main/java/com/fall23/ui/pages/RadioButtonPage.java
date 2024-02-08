package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    public RadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='yesRadio']")
    public WebElement yesRadioBtn;

    @FindBy(xpath = "//label[@for='impressiveRadio']")
    public WebElement impressiveRadioBtn;

    @FindBy(xpath = "//label[@for='noRadio']")
    public WebElement noRadioBtn;

    WebElementHelper webElementHelper = new WebElementHelper();

    public RadioButtonPage clickYesBtn() {
        webElementHelper.clickCustom(yesRadioBtn);
        return this;
    }

    public RadioButtonPage clickImpressiveBtn() {
        webElementHelper.clickCustom(impressiveRadioBtn);
        return this;
    }

    public RadioButtonPage clickNoBtn() {
        webElementHelper.clickCustom(noRadioBtn);
        return this;
    }
}
