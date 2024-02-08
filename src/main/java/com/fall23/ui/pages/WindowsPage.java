package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsPage {


    public WindowsPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[@id='tabButton']")
    public WebElement newTabBtn;

    @FindBy(xpath = "//button[@id='windowButton']")
    public WebElement newWindowBtn;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    public WebElement newWindowMsgBtn;
}
