package org.ogya.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    // Locators
    private final By usernameFieldLocator = By.id("user-name");
    private final By passwordFieldLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(usernameFieldLocator);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }
}