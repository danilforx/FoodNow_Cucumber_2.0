package foodnow.pages;

import foodnow.core.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPage extends BaseHelper {
    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//a[@href='#/login']")
    WebElement linkLogin;
    public AuthorizationPage clickOnLinkLogin() {
        pause(2000);
        click(linkLogin);
        return this;
    }

    @FindBy(xpath = "//button[normalize-space(text())='Log out']")
    WebElement logOutButton;
    public AuthorizationPage verifyTextMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> logOutButton.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//div[contains(text(), 'Login or email is invalid. Try again.')]")
    WebElement textMessageInvalidLogin;
    public AuthorizationPage verifyTextMessageInvalidLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> textMessageInvalidLogin.isDisplayed());
        return this;
    }


    @FindBy(xpath = "(//div[@class='css-1wo8pw5']//a)[2]")
    WebElement linkRegistration;
    public AuthorizationPage clickOnLinkRegistration() {
        pause(2000);
        click(linkRegistration);
        return this;
    }


    @FindBy(xpath = "//input[@id='firstName-id']")
    WebElement userfirstName;
    @FindBy(xpath = "//input[@id='lastName-id']")
    WebElement userlastName;
    @FindBy(xpath = "//input[@id='email-id']")
    WebElement userEmail;
    @FindBy(xpath = "//input[@id='password-id']")
    WebElement userPassword;
    @FindBy(xpath = "//input[@id='phoneNumber-id']")
    WebElement userPhone;
    public AuthorizationPage typeFullValidData( String firstName, String lastName, String mail, String password, String phone) {
        type(userfirstName, firstName);
        type(userlastName, lastName);
        type(userEmail, mail);
        type(userPassword, password);
        type(userPhone, phone);
       return this;
    }

    @FindBy(xpath = "//button[text()='Registration']")
    WebElement submitRegister;
    public AuthorizationPage clickOnButtonRegistration() {
        click(submitRegister);
        return this;
    }


    @FindBy(xpath = "//h4[normalize-space(text())='Login']")
    WebElement loginPage;
    public void toTheLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage));
        assert loginPage.isDisplayed();
    }
}
