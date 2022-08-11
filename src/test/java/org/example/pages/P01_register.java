package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {
    public P01_register() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[class=\"ico-register\"]")
    public
    WebElement registerBtn;

    @FindBy(id = "gender-male")
    public
    WebElement maleRadio;

    @FindBy(id = "FirstName")
    public
    WebElement firstName;

    @FindBy(id = "LastName")
    public
    WebElement lastName;

    @FindBy(css = "select[name=\"DateOfBirthDay\"]")
    public
    WebElement DOB_SelectDay;

    @FindBy(css = "select[name=\"DateOfBirthMonth\"]")
    public
    WebElement DOB_SelectMonth;

    @FindBy(css = "select[name=\"DateOfBirthYear\"]")
    public
    WebElement DOB_SelectYear;

    @FindBy(id = "Email")
    public
    WebElement Email;

    @FindBy(id = "Password")
    public
    WebElement password;

    @FindBy(id = "ConfirmPassword")
    public
    WebElement confirmPassword;

    @FindBy(id = "register-button")
    public
    WebElement registerButton2;

    @FindBy(css = "div[class=\"result\"]")
    public
    WebElement Result;
}
