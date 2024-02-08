package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    WebElementHelper webElementHelper = new WebElementHelper();
    Actions actions;
    ButtonsPage buttonsPage;

    public ButtonsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        actions = new Actions(Driver.getDriver());
    }

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleBtn;

    @FindBy(css = "#rightClickBtn")
    public WebElement rightBtn;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement DynamicBtn;

    public ButtonsPage clickDoubleBtn() {
        actions.doubleClick(doubleBtn).perform();
        return this;
    }

    public ButtonsPage clickRightBtn() {
        actions.contextClick(rightBtn).perform();
        return this;
    }

    public ButtonsPage dynamicClickBtn() {
        actions.click(DynamicBtn).perform();
        return this;
    }
}
