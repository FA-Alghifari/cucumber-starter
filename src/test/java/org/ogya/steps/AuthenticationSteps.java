package org.ogya.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ogya.pages.LoginPage;
import org.ogya.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AuthenticationSteps {
    WebDriver driver;
    LoginPage loginPage;

    public AuthenticationSteps() {
        this.driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
    }

    @When("the user enter valid username and password")
    public void the_user_enter_valid_username_and_password() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("click on the login button")
    public void click_on_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
