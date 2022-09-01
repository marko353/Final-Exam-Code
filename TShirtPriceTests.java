package tests;

import org.junit.Test;

import pages.AddToCartPage;
import pages.SigninPage;
import pages.TShirtPricePage;

public class TShirtPriceTests extends BaseTest {
    public SigninPage signinPage;
    public AddToCartPage addToCartPage;
    public TShirtPricePage tShirtPricePage;
    double totalPrice = 18.51;
    @Test
    public void price() {
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        TShirtPricePage tShirtPricePage = new TShirtPricePage(driver);
        signinPage.basePage();
        addToCartPage.tShirtButton();
        addToCartPage.clickOnWiewList();
        addToCartPage.addToCart();
        tShirtPricePage.proccedToCheckOut();
        tShirtPricePage.verifyTotalPrice(totalPrice);
    }

}
