package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    //Page Object Model --> pattern
    //создаем конструктор и внутрь передаем PageFactory
    public TextBoxPage (){
        // this означает текущий класс
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="userName")// аннотация  @FindBy не будет работать без PageFactory.initElements
    public WebElement fullNameInput;

    @FindBy(id ="userEmail")
    public WebElement emailInput;

    @FindBy(id ="currentAddress")
    public WebElement currentAddress;

    @FindBy(id ="permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id ="submit")
    public WebElement submitBtn;

    //Создали объект класса WebElementHelper, чтобы вызвать его методы
    WebElementHelper webElementHelper = new WebElementHelper();


    public TextBoxPage fillUpFullName(String fullName){

        webElementHelper.sendKeysCustom(fullNameInput,fullName);
        return this;
    }

    public TextBoxPage fillUpEmail (String email){
        webElementHelper.sendKeysCustom(emailInput,email);
        return this;
    }

    public TextBoxPage fillUpCurrentAddress (String address){
        webElementHelper.sendKeysCustom(currentAddress,address);
        return this;
    }
    public TextBoxPage fillUpPermanentAddress (String address){
        webElementHelper.sendKeysCustom(permanentAddress,address);
        return this;
    }
    public TextBoxPage clickSubmitBtn() {
        webElementHelper
                .scrollToElement(submitBtn)
                .clickCustom(submitBtn);
        return this;
    }

}
