package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    public P02_login() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[class=\"ico-login\"]")
    public WebElement loginbtn;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Password")
    public WebElement Password;

    @FindBy(css = "button[class=\"button-1 login-button\"]")
    public WebElement loginbutton2;

    @FindBy(css = "div[class=\"message-error validation-summary-errors\"]")
    public WebElement errorMessage;
}
