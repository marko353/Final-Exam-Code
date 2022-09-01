package tests;

import org.junit.Test;

import pages.PopularPage;
import pages.SigninPage;

public class PopularTest extends BaseTest {
    public PopularPage popularPage;
    public SigninPage signinPage;

    int numOlItems = 7;

    @Test
    public void numberOfItemsPopular() {
        PopularPage popularPage = new PopularPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        popularPage.numberOfItems(numOlItems);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

}
