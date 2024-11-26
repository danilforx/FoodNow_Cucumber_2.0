package foodnow.pages;

import foodnow.core.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage extends BaseHelper {
    public OrderPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//h4[(text())='Order details']")
    WebElement orderDetails;
    public OrderPage assertPaymet() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> orderDetails.isDisplayed());
        return this;
    }

    @FindBy(xpath = "(//input[@class='css-1l4kvas'])[1]")
    WebElement typeAddress;
    public OrderPage enterAddress() {
        type(typeAddress,"123 Main Street");
        return this;
    }


    @FindBy(xpath = "//div[@role='combobox']")
    WebElement payment;
    public OrderPage clickSubmitOrder() {
        pause(2000);
        click(payment);
        return this;
    }

    @FindBy(xpath = "//li[@data-value='PAYPAL']")
    WebElement payPal;
    public OrderPage selectPayPal() {
        pause(2000);
        click(payPal);
        return this;
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitOrder;
    public OrderPage chooseSubmitOrder() {
        pause(2000);
        click(submitOrder);
        return this;
    }

    @FindBy(xpath = "(//input[contains(@class,'CheckoutInput Input')])[1]")
    WebElement address;
    public OrderPage checkedPaymet() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> address.isDisplayed());
        return this;
    }
}
