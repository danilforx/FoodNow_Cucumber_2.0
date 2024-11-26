package foodnow.stepsDefinitions;

import foodnow.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import static foodnow.core.BaseHelper.driver;

public class LoginPageSteps {


    @And("Пользователь вводит валидные данные")
    public void userEntersValidCredentials() {
        new LoginPage(driver).enterCredentials("addproduct@gmail.com", "addproduct@gmail.com");
    }

    @And("Пользователь нажимает на button Login")
    public void userClickOnButtonLogin() {
        new LoginPage(driver).clickOnButtonLogin();
    }

    @And("Пользователь вводит валидный email и невалидный password")
    public void userEntersValidEmailInvalidPassword(DataTable table) {
        new LoginPage(driver).enterCredentials(table);
    }
}
