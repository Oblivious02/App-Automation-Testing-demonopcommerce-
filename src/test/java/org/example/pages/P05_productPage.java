package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P05_productPage {
    public P05_productPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class=\"sku\"]>span[class=\"value\"]")
    public WebElement skuProductPage;
}
