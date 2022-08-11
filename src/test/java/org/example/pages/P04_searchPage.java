package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P04_searchPage {
    public P04_searchPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h2[class=\"product-title\"]>a")
    public WebElement productTitle;
}
