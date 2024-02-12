package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {


    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".rct-collapse-btn")
    public WebElement btnIconHome;

    @FindBy(xpath = "(//button[@class='rct-collapse rct-collapse-btn'])[2]")
    public WebElement btnIconDesktop;


    @FindBy(xpath = "(//button[@class='rct-collapse rct-collapse-btn'])[3]")
    public WebElement btnIconDocuments;

    @FindBy(xpath = "(//li[@class='rct-node rct-node-parent rct-node-collapsed'])[3]")
    public WebElement btnIconDownloads;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[1]")
    public WebElement checkBoxHome;

    @FindBy(xpath = "//span[text()='Desktop']")
    public WebElement checkBoxDesktop;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[3]")
    public WebElement checkBoxNotes;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[4]")
    public WebElement checkBoxCommands;

    @FindBy(xpath = "//span[text()='Documents']")
    public WebElement checkBoxDocuments;

    @FindBy(xpath = "//span[text()='Downloads']")
    public WebElement checkBoxDownloads;


    public CheckBoxPage clickToBtnIcon(WebElement element) {
        element.click();
        return this;

    }

    public CheckBoxPage clickToCheckBox(WebElement element) {
        element.click();
        return this;
    }

}
