package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef extends P03_homePage {
    @When("change to EUR")
    public void changeToEUR(){
        Select dropdown = new Select(currencyDropdown);
        dropdown.selectByVisibleText("Euro");
    }

    @Then("products in EUR")
    public void productsInEUR() {
        int size = driver.findElements(prices).size();
        for (int i = 0; i < size; i++) {
            Assert.assertTrue(driver.findElements(prices).get(i).getText().contains("€"));
        }
    }
}
