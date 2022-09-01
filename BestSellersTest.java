package tests;

import org.junit.Test;

import pages.BestSellersPage;

import pages.SigninPage;

public class BestSellersTest extends BaseTest {
    public BestSellersPage bestSellersPage;
    public SigninPage signinPage;
    int expectedNSell = 7;

    @Test
    public void numberOfSellersI() {

        SigninPage signinPage = new SigninPage(driver);
        BestSellersPage bestSellersPage = new BestSellersPage(driver);
        signinPage.basePage();
        bestSellersPage.clickSellers();
        bestSellersPage.numberOfItemsS(expectedNSell);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
