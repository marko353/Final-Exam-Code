package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

   
    By signInButtonBy = By.className("login");
    By createMailBy = By.xpath("//*[@id='email_create']");
    By eMailButtonBy = By.xpath("//*[@id='SubmitCreate']");
    By expectedTextBy = By.xpath("//*[@id='account-creation_form']/div[1]/h3");
    By radiobuttonBy = By.id("id_gender1");
    By frstNameBy = By.id("customer_firstname");
    By lastNameBy = By.id("customer_lastname");
    By regPasswordBy = By.id("passwd");
    By dropBatBy = By.className("selector");
    By dropDayBy = By.xpath("//*[@id='days']/option[13]");
    By dropBatMonthsBy = By.id("uniform-months");
    By dropMonthBy = By.xpath("//*[@id='months']/option[8]");
    By dropButtYearsBy = By.id("uniform-years");
    By dropYearsBy = By.xpath("//*[@id='years']/option[40]");
    By nameCompanyBy = By.id("company");
    By adres1By = By.id("address1");
    By cityNameBy = By.id("city");
    By nameStateBy = By.id("uniform-id_state");
    By stateNameBy = By.xpath("//*[@id='id_state']/option[6]");
    By postCodeBy = By.id("postcode");
    By phoneNumberBy = By.id("phone_mobile");
    By adres2By = By.id("alias");
    By buttonReg = By.xpath("//*[@id='submitAccount']/span/i");
    By singOutBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");

    public RegistrationPage basePage() {
        driver.get(baseURL);
        return this;
    }

    public RegistrationPage signin() {
        click(signInButtonBy);
        return this;
    }

    public RegistrationPage assertTextEqual(String actualText) {
        String expectedText = readText(expectedTextBy);
        Assert.assertEquals(actualText, expectedText);
        return this;

    }

    public RegistrationPage createFirstName(String First) {
        click(radiobuttonBy);
        writeText(frstNameBy, First);

        return this;

    }

    public RegistrationPage createLastName(String Lest) {
        writeText(lastNameBy, Lest);
        return this;
    }

    public RegistrationPage createPassword(String Password) {
        writeText(regPasswordBy, Password);
        return this;
    }

    public RegistrationPage dropBatDay() {
        click(dropBatBy);
        return this;
    }

    public RegistrationPage dropDay() {
        click(dropDayBy);
        return this;
    }

    public RegistrationPage dropButMonths() {
        click(dropBatMonthsBy);
        return this;
    }

    public RegistrationPage dropMonths() {
        click(dropMonthBy);
        return this;
    }

    public RegistrationPage dropButYears() {
        click(dropButtYearsBy);
        return this;
    }

    public RegistrationPage dropYears() {
        click(dropYearsBy);
        return this;
    }

    public RegistrationPage companyName(String text) {
        writeText(nameCompanyBy, text);
        return this;
    }

    public RegistrationPage address(String adresN) {
        writeText(adres1By, adresN);
        return this;
    }

    public RegistrationPage city(String sName) {
        writeText(cityNameBy, sName);
        return this;
    }

    public RegistrationPage stateNameButt() {
        click(nameStateBy);
        return this;
    }

    public RegistrationPage stateName() {
        click(stateNameBy);
        return this;
    }

    public RegistrationPage zipCode(String code) {
        writeText(postCodeBy, code);
        return this;
    }

    public RegistrationPage phoneNum(String numb) {
        writeText(phoneNumberBy, numb);
        return this;
    }

    public RegistrationPage AssignAdres(String aDres) {
        writeText(adres2By, aDres);
        return this;
    }

    public RegistrationPage registerButton() {
        click(buttonReg);
        return this;
    }

    public RegistrationPage singOutButton() {
        click(singOutBy);
        return this;
    }

}
