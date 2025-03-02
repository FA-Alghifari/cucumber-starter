package org.ogya.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.ogya.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class WebHooks {
    WebDriver driver;

    @Before
    public void setDriver(){
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        DriverManager.quitDriver();
    }
}
