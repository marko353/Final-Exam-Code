package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends BasePage {
    public SigninPage(WebDriver driver) {
        super(driver);
    }

    
    By sigButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By createMailBy = By.id("email_create");
    By clickButtonBy = By.id("SubmitCreate");
    By expectedTBy = By.xpath("//*[@id='account-creation_form']/div[1]/h3");

    public SigninPage basePage() {
        driver.get(baseURL);
        return this;

    }

    public SigninPage signin() {
        click(sigButtonBy);
        return this;
    }

    public SigninPage createMail1(String mail) {
        writeText(createMailBy, mail);
        click(clickButtonBy);
        return this;
    }

}
