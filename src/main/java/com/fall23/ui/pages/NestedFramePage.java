package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramePage {

    public NestedFramePage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id = "frame1")
    public WebElement parentFrame;

    @FindBy (xpath = "")
    public WebElement childFrame;
}
