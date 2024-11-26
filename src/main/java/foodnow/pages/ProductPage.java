package foodnow.pages;

import foodnow.core.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BaseHelper {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[text()='Philadelphia Original']/following-sibling::div)[3]")
    WebElement productDescription;
    public ProductPage verifyProductDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> productDescription.isDisplayed());
        return this;
    }

    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement addToCart;
    public ProductPage clickAddToCart() {
        pause(2000);
        click(addToCart);
        return this;
    }
}
