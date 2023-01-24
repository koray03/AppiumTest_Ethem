package com.MyAppium.pages;

import com.MyAppium.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply;

    @AndroidFindBy(accessibility = "equals")
    public MobileElement equals;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public MobileElement result;

    public void clickDigit(int digit) {

        // create a method: parameter is digit number-int, void method, click action on that number
        // com.google.android.calculator:id/digit_9
        String id = "com.google.android.calculator:id/digit_" + digit;
        MobileElement number = Driver.getDriver().findElement(By.id(id));
        number.click();


    }


}
