package org.ogya.steps;

import io.cucumber.java.en.Given;
import org.ogya.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonSteps {
    private final WebDriver driver;

    public CommonSteps() {
        this.driver = DriverManager.getDriver();
    }

    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        String expectedUrl = "https://www.saucedemo.com/";
        driver.get(expectedUrl);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
