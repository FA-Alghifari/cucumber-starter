package org.ogya.steps;

import io.cucumber.java.en.Given;
import org.ogya.pages.LoginPage;
import org.ogya.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NavigationSteps {
    WebDriver driver;
    LoginPage loginPage;

    public NavigationSteps() {
        this.driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        String expectedUrl = "https://www.saucedemo.com/";
        driver.get(expectedUrl);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
