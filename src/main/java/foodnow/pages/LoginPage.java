package foodnow.pages;

import foodnow.core.BaseHelper;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BaseHelper {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@id='email-id']")
    WebElement userEmail;
    @FindBy(xpath = "//input[@id='password-id']")
    WebElement userPassword;
    public LoginPage enterCredentials(String user, String password) {
        type(userEmail, user);
        type(userPassword, password);
        return this;
    }


    @FindBy(xpath = "//button[text()='Login']")
    WebElement submitLogin;
    public LoginPage clickOnButtonLogin() {
        pause(2000);
        click(submitLogin);
        return this;
    }


    public LoginPage enterCredentials(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        enterCredentials(email, password);
        return this;
    }
}
