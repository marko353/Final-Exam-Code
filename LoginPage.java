package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);

    }
    

By mailName3By = By.id("email");
By maiPasswordBy = By.id("passwd");
By maiButtonBy = By.id("SubmitLogin");
By errorText = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");


    

    public LoginPage basePage() {
        driver.get(baseURL);
        return this;
    }

    
    public LoginPage login(String username, String password) {
        writeText(mailName3By, username);
        writeText(maiPasswordBy, password);
        click(maiButtonBy);
        return this;

    }

    public LoginPage emptyMail(String expectedText) {
        String actualText = readText(errorText);
        assertEquals(expectedText, actualText);
        return this;
    }
    public LoginPage wrongPassword(String username,String password){
        writeText(mailName3By, username);
        writeText(maiPasswordBy, password);
        click(maiButtonBy);
        return this;
    }
}
