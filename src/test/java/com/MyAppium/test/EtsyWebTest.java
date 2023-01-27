package com.MyAppium.test;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EtsyWebTest {

    @Test

    public  void Test() throws MalformedURLException, InterruptedException {


        // to start web browser on mobile we need to provide driver binary in appium server as Binary path then start server.

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");

        // To test web applications on Chrome browser we provide following line
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        URL url = new URL("http://localhost:4723/wd/hub");
        WebDriver driver = new RemoteWebDriver(url,desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com");

        WebElement searchField = driver.findElement(By.name("search_query"));

        searchField.sendKeys("necklace"+ Keys.ENTER);

        Thread.sleep(1000);

        List<WebElement> searchResults = driver.findElements(By.tagName("h3"));

        for (WebElement searchResult : searchResults) {
            System.out.println(searchResult.getText());
        }




        Thread.sleep(3000);

        driver.quit();



    }
}
