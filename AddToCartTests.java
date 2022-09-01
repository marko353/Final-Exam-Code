package tests;

import org.junit.Test;

import pages.SigninPage;
import pages.AddToCartPage;

public class AddToCartTests extends BaseTest {
    public SigninPage signinPage;
    public AddToCartPage addToCartPage;

    @Test
    public void mouveToCart() {
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        SigninPage signinPage = new SigninPage(driver);

        signinPage.basePage();
        addToCartPage.tShirtButton();
        addToCartPage.clickOnWiewList();
        addToCartPage.addToCart();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
