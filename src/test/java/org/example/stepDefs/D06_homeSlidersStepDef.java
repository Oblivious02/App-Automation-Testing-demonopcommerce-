package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.example.pages.P03_homePage.iPhoneSlider;
import static org.example.pages.P03_homePage.nokiaSlider;
import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
    @When("user clicks on Nokia slider")
    public void userClicksOnNokiaSlider() {
        nokiaSlider.click();
    }

    @Then("user gets redirected to Nokia page")
    public void userGetsRedirectedToNokiaPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
    }

    @When("user clicks on iPhone slider")
    public void userClicksOnIPhoneSlider() {
        iPhoneSlider.click();
    }

    @Then("user gets redirected to iPhone page")
    public void userGetsRedirectedToIPhonePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
    }
}
