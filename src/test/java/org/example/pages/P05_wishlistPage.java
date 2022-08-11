package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P05_wishlistPage {
    public P05_wishlistPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[class=\"qty-input\"]")
    public static WebElement quantityInput;
}
