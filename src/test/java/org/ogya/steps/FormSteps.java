package org.ogya.steps;

import io.cucumber.java.en.When;
import org.ogya.pages.LoginPage;
import org.ogya.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class FormSteps {
    WebDriver driver;
    LoginPage loginPage;

    public FormSteps() {
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
}