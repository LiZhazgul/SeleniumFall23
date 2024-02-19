package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class WebElementHelper {
    private Select select;

    // метод Chaining
    //Chain of invocation -паттерн
    public WebElementHelper waitForButtonToBeClickAble(WebElement element){

        //создаем объект класса WebDriverWait, через название класса вызываем метод getDriver()
        //где в методе есть switch на drivers,ждать 7 секунд
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))

                //пока элемент не станет кликабельным
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementHelper waitForElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementHelper clickCustom(WebElement element){
        waitForButtonToBeClickAble(element);
        waitForButtonToBeClickAble(element);
        scrollToElement(element);
        element.click();
        return this;
    }

    public WebElementHelper sendKeysCustom (WebElement element,String txt){
        waitForElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementHelper scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public WebElementHelper selectByText(WebElement element,String txt) {

        select = new Select(element);
        select.selectByVisibleText(txt);
        return this;

    }

    public WebElementHelper selectByIndex (WebElement element,int index){
        select =new Select(element);
        select.selectByIndex(index);
        return  this;
    }

    public WebElementHelper selectByValue (WebElement element,String value){
        select = new Select(element);
        select.deselectByValue(value);
        return this;
    }

    public List<String> getAllDropDownValue (WebElement element){
        select = new Select(element);
        List <WebElement> elementList =select.getOptions();
        List <String> valueList =new LinkedList<>();
         for (WebElement element1 : elementList){
             valueList.add(element1.getText());
         }return valueList;

    }
    public WebElementHelper sendKeysWithEnter (WebElement element,String txt){
        waitForElementToBeDisplayed(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }



}
