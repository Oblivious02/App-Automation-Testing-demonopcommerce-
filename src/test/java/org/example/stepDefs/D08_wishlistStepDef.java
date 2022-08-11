package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P05_wishlistPage;
import org.testng.asserts.SoftAssert;

import static org.example.pages.P03_homePage.*;
import static org.example.pages.P05_wishlistPage.quantityInput;
import static org.example.stepDefs.Hooks.driver;

public class D08_wishlistStepDef {
    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    @When("user adds HTC phone to wishlist")
    public void userAddsHTCPhoneToWishlist() {
        wishlistHTCButton.click();
    }

    @Then("phone added to wishlist successfully")
    public void phoneAddedToWishlistSuccessfully() {
        soft.assertTrue(successBar.getText().contains("The product has been added to your wishlist"));
        soft.assertEquals(successBar.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
    }

    @And("go to wishlist page")
    public void goToWishlistPage() throws InterruptedException {
        Thread.sleep(5000);
        wishlistPageButton.click();
    }

    @Then("check if quantity is more than 0")
    public void checkIfQuantityIsMoreThan() {
        P05_wishlistPage wishlistPage = new P05_wishlistPage();
        boolean condition = false;
        if (Integer.parseInt(quantityInput.getAttribute("value")) > 0){
            condition = true;
        }
        soft.assertTrue(condition);
    }
}
