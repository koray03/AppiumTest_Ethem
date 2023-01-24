package com.MyAppium.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    @Test
    public void initialTest() throws InterruptedException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        /*
        We need to create an appium driver. Driver constructor requires some capability settings and also provide URL
         */

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        // this is where we tell appium what we are testing
        URL url = new URL("http://localhost:4723/wd/hub");

        AppiumDriver<MobileElement> driver = new AppiumDriver<>(url, caps);

        Thread.sleep(5000);

        driver.closeApp();

    }


}
