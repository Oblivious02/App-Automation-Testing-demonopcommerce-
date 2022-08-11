package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P04_searchPage;
import org.example.pages.P05_productPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef extends P03_homePage {
    String productName;

    @When("^user enters ([^\"]*) in search$")
    public void userEntersProductNameInSearch(String productName) {
        this.productName = productName;
        search.sendKeys(productName);
        searchButton.click();
    }


    @Then("successful search and relevant results")
    public void successfulSearchAndRelevantResults() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        int size = driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        for (int i = 0; i < size; i++) {
            soft.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).contains(productName));
        }
    }
    P04_searchPage searchPage = new P04_searchPage();
    P05_productPage productPage = new P05_productPage();
    @Then("successful search and click on result")
    public void successfulSearchAndClickOnResult() {
        searchPage.productTitle.click();
        Assert.assertTrue(productPage.skuProductPage.getText().contains(productName));
    }
}
