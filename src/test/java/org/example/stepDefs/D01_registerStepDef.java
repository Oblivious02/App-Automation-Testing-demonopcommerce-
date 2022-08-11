package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef extends P01_register {

    @Given("user go to register page")
    public void navigateRegister() {
        registerBtn.click();
    }


    @When("user select gender type")
    public void userSelectGenderType() {
        maleRadio.click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstname, String lastname) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select day = new Select(DOB_SelectDay);
        Select month = new Select(DOB_SelectMonth);
        Select year = new Select(DOB_SelectYear);

        day.selectByIndex(12);
        month.selectByIndex(2);
        year.selectByValue("2002");

    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        Email.click();
        Email.sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        password.sendKeys(arg0);
        confirmPassword.sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registerButton2.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        String actualResult = Result.getText();
        String expectedResult = "Your registration completed";
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(Result.getCssValue("color"), "rgba(76, 177, 124, 1)");
        soft.assertAll();
    }
}
