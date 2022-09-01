package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage {
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

  
    By tShirtBut = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By clickOnPictureBy = By.xpath("//*[@id='list']/a/i");
    By addToCartBy = By.xpath("//*[@id='center_column']/ul/li/div/div/div[3]/div/div[2]/a[1]/span");

    public AddToCartPage basePage() {
        driver.get(baseURL);
        return this;

    }

    public AddToCartPage tShirtButton() {
        click(tShirtBut);
        return this;
    }

    public AddToCartPage clickOnWiewList() {
        click(clickOnPictureBy);
        return this;
    }

    public AddToCartPage addToCart() {
        click(addToCartBy);
        return this;
    }

}
