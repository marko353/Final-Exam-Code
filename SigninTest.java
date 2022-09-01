package tests;

import org.junit.Test;

import pages.SigninPage;

public class SigninTest extends BaseTest {
    public SigninPage signiPage;
    String mailName = "marko353@gmail.com";

    @Test
    public void sucessfulSign() {
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signin();

    }
}
