package org.ogya.steps;

import io.cucumber.java.en.Then;
import org.ogya.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionSteps {
    WebDriver driver;

    public AssertionSteps() {
        this.driver = DriverManager.getDriver();
    }

    @Then("user should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}

