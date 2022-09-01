package tests;

import java.util.UUID;

import org.junit.Test;

import pages.RegistrationPage;
import pages.SigninPage;

public class RegistrationTest extends BaseTest {
    RegistrationPage registrationPage;
    SigninPage signinPage;
    String passw = "Hel@ena1353";
    String name1 = "marko";
    String lastName1 = "stojanovic";
    String comName = "LIVECONTROL";
    String adresName = "145 Berkelej St.";
    String cityName = "Santa Monika";
    String codeZip = "90404";
    String phone = "+1 310-361-4169";
    String assignA = "michigan ave";
    String actualT = "YOUR PERSONAL INFORMATION";
    String randomEmail = UUID.randomUUID().toString() + "@test.com"; // 237e9877-e79b-12d4-a765-321741963000@test.com
    @Test
    public void registration() {
      
        RegistrationPage registrationPage = new RegistrationPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signin();
        signinPage.createMail1(randomEmail);
        registrationPage.assertTextEqual(actualT);
        registrationPage.createFirstName(name1);
        registrationPage.createLastName(lastName1);
        registrationPage.createPassword(passw);
        registrationPage.dropBatDay();
        registrationPage.dropDay();
        registrationPage.dropButMonths();
        registrationPage.dropMonths();
        registrationPage.dropButYears();
        registrationPage.dropYears();
        registrationPage.companyName(comName);
        registrationPage.address(adresName);
        registrationPage.address(adresName);
        registrationPage.address(adresName);
        registrationPage.city(cityName);
        registrationPage.stateNameButt();
        registrationPage.stateName();
        registrationPage.zipCode(codeZip);
        registrationPage.phoneNum(phone);
        registrationPage.AssignAdres(assignA);
        registrationPage.registerButton();
        registrationPage.singOutButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
