package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    public TextBoxPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="userName")
    public WebElement fullNameInput;

    @FindBy(id ="userEmail")
    public WebElement emailInput;

    @FindBy(id ="currentAddress")
    public WebElement currentAddress;

    @FindBy(id ="permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id ="submit")
    public WebElement submitBtn;
    WebElementHelper webElementHelper = new WebElementHelper();
    public TextBoxPage fillUpFullName(String fullName){

        webElementHelper.sendKeysCustomn(fullNameInput,fullName);
        return this;
    }

    public TextBoxPage fillUpEmail (String email){
        webElementHelper.sendKeysCustomn(emailInput,email);
        return this;
    }

    public TextBoxPage fillUpCurrentAddress (String address){
        webElementHelper.sendKeysCustomn(currentAddress,address);
        return this;
    }
    public TextBoxPage fillUpPermanentAddress (String address){
        webElementHelper.sendKeysCustomn(permanentAddress,address);
        return this;
    }
    public TextBoxPage clickSubmitBtn() {
        webElementHelper
                .scrollToElement(submitBtn)
                .clickCustom(submitBtn);
        return this;
    }

}
