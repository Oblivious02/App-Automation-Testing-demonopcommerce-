package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;


import java.util.ArrayList;

import static org.example.pages.P03_homePage.*;
import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage home = new P03_homePage();
    @When("user opens facebook link")
    public void userOpensFacebookLink() {
        facebookLink.click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String link) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains(link));
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        twitterLink.click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        rssLink.click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        youTubeLink.click();
    }
}
