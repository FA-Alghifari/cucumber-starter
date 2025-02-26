package org.ogya.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefs {
    WebDriver driver;


    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/index.html");
        Assert.assertTrue(driver.findElement(By.id("login_credentials")).isDisplayed(),"Page is displayed");
    }
    @When("the user enter valid username and password")
    public void the_user_enter_valid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @When("click on the login button")
    public void click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("user should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        Assert.assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed(),"Page is displayed");
    }
}
