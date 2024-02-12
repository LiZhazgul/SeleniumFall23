package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    public FramePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "frame1")
    public WebElement frame1;

    @FindBy (id = "frame2")
    public WebElement frame2;

    @FindBy (id = "sampleHeading")
    public WebElement textElement;
}
