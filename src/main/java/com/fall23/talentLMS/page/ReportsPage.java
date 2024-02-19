package com.fall23.talentLMS.page;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReportsPage {



    public ReportsPage (){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy (xpath ="(//div[@class='tl-bold-link']/child::*)[9]")
    public WebElement reportsLink;

    @FindBy (xpath = "//a[@title='User reports']")
    public WebElement userReportsLink;

    @FindBy(xpath = "//a[text()='Course reports']")
    public WebElement courseReportsLink;

    @FindBy(linkText = "Branch reports")
    public WebElement branchReportsLink;

    @FindBy(xpath = "//div//div/*[@title='Group reports']")
    public WebElement groupReportsLink;

    @FindBy (xpath = "//*[text()='SCORM reports']")
    public WebElement scormReportsLink;

    @FindBy(xpath = "//div/child::*[contains(text(),'Test')]")
    public WebElement testReportsLink;

    @FindBy (xpath = "//*[@title='Survey reports']")
    public WebElement surveyReportsLink;

    @FindBy (xpath = "//*[@title='Assignment reports']")
    public WebElement assignmentReportsLink;

    @FindBy (xpath = "//*[text()='ILT reports']")
    public WebElement iltReportsLink;

    @FindBy (xpath = "//*[text()='Custom reports']")
    public WebElement customReportsLink;

    @FindBy(linkText = "Overview")
    public WebElement overviewLink;

    @FindBy(linkText = "Infographics")
    public WebElement infographics;

    @FindBy (linkText = "Training matrix")
    public WebElement trainingMatrix;

    @FindBy(linkText = "Timeline")
    public WebElement timeLine;

    @FindBy(xpath = "//*[@data-period='today']")
    public WebElement todayBtn;

    @FindBy(xpath = "//*[@data-period='yesterday']")
    public WebElement yesterdayBtn;

    @FindBy (xpath = "//*[@data-period='week']")
    public WebElement weekBtn;

    @FindBy(xpath = "//*[@data-period='month']")
    public WebElement monthBtn;

    @FindBy(xpath = "//*[@data-period='year']")
    public WebElement yearBtn;

    @FindBy(xpath = "//*[@data-period='period']")
    public WebElement periodBtn;

    @FindBy (xpath = "//div/child::*[@id='tl-export-system']")
    public WebElement trainingProgress;

    public static void elements() throws InterruptedException {
        ReportsPage reportsPage =new ReportsPage();

        WebDriver driver= Driver.getDriver();
        driver.get("https://zhazgulfall2023.talentlms.com/dashboard");
        WebElement loginElement =driver.findElement(By.xpath("//*[@name='login']"));
        loginElement.sendKeys("miracle.world@mail.ru");
        Thread.sleep(2000);
        WebElement passwordElement = driver.findElement(By.xpath("//*[@name='password']"));
        passwordElement.sendKeys("Zhazgul9");
        Thread.sleep(2000);
        WebElement submitBtn = driver.findElement(By.xpath("//*[@name='submit']"));
        submitBtn.click();
        Thread.sleep(2000);
//        List<WebElement> links = new ArrayList<>();
//        for(int i = 0; i < links.size(); i++){
//            links.add(reportsPage.userReportsLink);
//            links.add(reportsPage.courseReportsLink);
//            links.add(reportsPage.branchReportsLink);
//        }
//        System.out.println(links);

        // Создаем список links
        List<WebElement> links = new ArrayList<>();

        // Добавляем элементы в список links с помощью цикла
        for (Field field : ReportsPage.class.getDeclaredFields()) {
            if (field.getType().equals(WebElement.class)) {
                try {
                    WebElement element = (WebElement) field.get(reportsPage);
                    links.add(element);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Выводим список links в консоль
        System.out.println(links);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Driver.getDriver();
        driver.get("https://zhazgulfall2023.talentlms.com/dashboard");
        WebElement loginElement =driver.findElement(By.xpath("//*[@name='login']"));
        loginElement.sendKeys("miracle.world@mail.ru");
        Thread.sleep(2000);
        WebElement passwordElement = driver.findElement(By.xpath("//*[@name='password']"));
        passwordElement.sendKeys("Zhazgul9");
        Thread.sleep(2000);
        WebElement submitBtn = driver.findElement(By.xpath("//*[@name='submit']"));
        submitBtn.click();
        Thread.sleep(2000);
        ReportsPage reportsPage= new ReportsPage();
        reportsPage.reportsLink.click();
        Thread.sleep(2000);
        reportsPage.userReportsLink.click();
    }


}
