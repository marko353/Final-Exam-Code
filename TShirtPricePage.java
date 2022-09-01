package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtPricePage extends BasePage {
    public TShirtPricePage(WebDriver driver) {
        super(driver);
    }

   
    By ToCheckOutBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");
    By expectedPrice1By = By.xpath("//*[@id='total_price']");
    By productPriceBy = By.id("total_product_price_1_1_0");
    By shippingPriceBy = By.xpath("//*[@id='total_shipping']");

    public TShirtPricePage basePage() {
        driver.get(baseURL);
        return this;
    }

    public TShirtPricePage proccedToCheckOut() {
        click(ToCheckOutBy);
        return this;

    }

    public TShirtPricePage verifyTotalPrice(double actualPrice) {
        double productPrice = Double.parseDouble(driver.findElement(productPriceBy).getText().substring(1));
        double shippingPrice = Double.parseDouble(driver.findElement(shippingPriceBy).getText().substring(1));
        double expectedPrice = productPrice + shippingPrice;
        Assert.assertEquals(expectedPrice, actualPrice, delta);
        return this;
    }

}
