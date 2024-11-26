package foodnow.pages;

import foodnow.core.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BaseHelper {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='MuiStack-root css-jj2ztu']//button)[2]")
    WebElement increaseQuantityButton;
    public CartPage increaseQuantityOfGoodsInTheCart() {
        pause(2000);
        click(increaseQuantityButton);
        return this;
    }

    @FindBy(xpath = "(//button[@aria-label='delete'])[2]")
    WebElement deleteProductButton;
    public CartPage deleteProductCart() {
        pause(2000);
        click(deleteProductButton);
        return this;
    }

    @FindBy(xpath = "//button[normalize-space(text())='Proceed to checkout']")
    WebElement proceedToCheckoutButton;
    public CartPage proceedToCheckout() {
        pause(2000);
        click(proceedToCheckoutButton);
        return this;
    }
}
