package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMenuPage {
    public SelectMenuPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (css = "#oldSelectMenu")
    public WebElement oldStyleSelect;
}
