package com.MyAppium.stepdefs;

import com.MyAppium.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabTestSteps {
    AppiumDriver<MobileElement> driver;
    @Given("Swaglab app started on mobile phone emulator")
    public void swaglab_app_started_on_mobile_phone_emulator() {
        driver = Driver.getDriver();
    }
    @When("User logins with valid credentials")
    public void user_logins_with_valid_credentials() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(MobileBy.AccessibilityId("test-Username")).sendKeys("standard_user");
        driver.findElement(MobileBy.AccessibilityId("test-Password")).sendKeys("secret_sauce");
        driver.findElement(MobileBy.AccessibilityId("test-LOGIN")).click();
    }
    @Then("Verify that user logged in")
    public void verify_that_user_logged_in() throws InterruptedException {

        Thread.sleep(4000);

        ((AndroidDriver)driver).findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Policy\"));");


    }

}