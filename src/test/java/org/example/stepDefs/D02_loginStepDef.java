package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef extends P02_login {

    @Given("user go to login page")
    public void userGoToLoginPage() {
        loginbtn.click();
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String email, String pass) {
        Email.sendKeys(email);
        Password.sendKeys(pass);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginbutton2.click();
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com"));
        soft.assertTrue(driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(errorMessage.getText().contains("Login was unsuccessful."));
        soft.assertEquals(errorMessage.getCssValue("color"), "rgba(228, 67, 75, 1)");
        soft.assertAll();
    }
}
