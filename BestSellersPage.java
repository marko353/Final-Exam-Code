package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellersPage extends BasePage {
    public BestSellersPage(WebDriver driver) {
        super(driver);

    }

   
    By actualItemsBy = By.xpath("//*[@id='blockbestsellers']/li");
    By SellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");

    public BestSellersPage basePage() {
        driver.get(baseURL);
        return this;
    }

    public BestSellersPage numberOfOLItems(int expectedNumber) {
        int actualNumOfItems = countItems(actualItemsBy);
        assertIntigerEquals(expectedNumber, actualNumOfItems);
        return this;
    }

    public BestSellersPage clickSellers() {
        click(SellersButtonBy);
        return this;
    }

    public BestSellersPage numberOfItemsS(int expectedNumberOfProducts) {

        int actualNumberOfProducts = countItems(actualItemsBy);
        assertIntigerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }

}
