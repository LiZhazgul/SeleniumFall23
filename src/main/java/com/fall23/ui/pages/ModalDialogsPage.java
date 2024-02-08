package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage {
    WebElementHelper webElementHelper = new WebElementHelper();

    public ModalDialogsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "showSmallModal")
    public WebElement smallModal;

    @FindBy(id = "showLargeModal")
    public WebElement largeModal;

    @FindBy(xpath = "//button[@id='closeSmallModal']")
    public WebElement smallModalClose;


    @FindBy(css = "#closeLargeModal")
    public WebElement largeModalClose;

    public ModalDialogsPage clickSmallBtn() {
        webElementHelper.clickCustom(smallModal);
        return this;
    }

    public ModalDialogsPage clickLargeBtn() {
        webElementHelper.clickCustom(largeModal);
        return this;
    }

    public ModalDialogsPage clickSmallClose() {
        webElementHelper.clickCustom(smallModalClose);
        return this;
    }

    public ModalDialogsPage clickLargeClose() {
        webElementHelper.clickCustom(largeModalClose);
        return this;
    }
}
