package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.pages.P03_homePage.*;
import static org.example.stepDefs.Hooks.driver;

import java.util.List;

public class D05_hoverCategoriesStepDef {

    @When("user hovers on a random category")
    public void userHoversOnARandomCategory(){
        List<WebElement> categories = driver.findElements(category);
        int max = 2, min = 0;
        int selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);
        Actions action = new Actions(driver);
        action.moveToElement(categories.get(selectedCategory)).perform();
        List<WebElement> subCategory = categories.get(selectedCategory).findElements(subcategory);
        int selectedSubCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        String subCategoryText = subCategory.get(selectedSubCategory).getText().toLowerCase().trim();
        subCategory.get(selectedSubCategory).click();

        Assert.assertTrue(driver.getTitle().toLowerCase().trim().contains(subCategoryText));
    }

    @And("clicks on a random subcategory")
    public void clicksOnARandomSubcategory() {

    }

    @Then("page redirects to the chosen subcategory")
    public void pageRedirectsToTheChosenSubcategory() {

    }
}
