package tests;

import org.junit.Test;

import pages.LoginPage;
import pages.RegistrationPage;
import pages.SigninPage;

public class LoginTests extends BaseTest {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public SigninPage signinPage;
    String eName = "testmarko123@gmail.com";
    String ePass = "Hel@ena@1353";
    String email1 = " ";
    String actualText1 = "expectedErrorBy";
    String errorContauner = "An email address required.";
    String wrongPas = "indigo44";
    String errorContauner1 = "Authentication failed.";

    @Test
    public void verifySuccesfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signin();
        loginPage.login(eName, ePass);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    @Test
    public void verifyUnsuccesfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signin();
        loginPage.login(email1, ePass);
        loginPage.emptyMail(errorContauner);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
    @Test
    public void verifyWrongPassword(){
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signin();
        loginPage.login(eName, wrongPas);
        loginPage.emptyMail(errorContauner1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
