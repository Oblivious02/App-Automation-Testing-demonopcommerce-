package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
    public P03_homePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "customerCurrency")
    public WebElement currencyDropdown;

    public By prices = By.cssSelector("span[class=\"price actual-price\"]");

    @FindBy(id = "small-searchterms")
    public WebElement search;

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public WebElement searchButton;

    public static By category = By.cssSelector("ul[class=\"top-menu notmobile\"] > li");
    public static By subcategory = By.cssSelector("ul[class=\"sublist first-level\"] > li");

    @FindBy(css = "img[src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]")
    public static WebElement nokiaSlider;

    @FindBy(css = "img[src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]")
    public static WebElement iPhoneSlider;

    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public static WebElement facebookLink;

    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public static WebElement twitterLink;

    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public static WebElement rssLink;

    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public static WebElement youTubeLink;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public static WebElement wishlistHTCButton;

    @FindBy(css = "div[class=\"bar-notification success\"]")
    public static WebElement successBar;

    @FindBy(css = "a[href=\"/wishlist\"]")
    public static WebElement wishlistPageButton;
}
