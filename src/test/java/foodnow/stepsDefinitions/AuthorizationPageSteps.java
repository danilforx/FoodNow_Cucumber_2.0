package foodnow.stepsDefinitions;

import foodnow.pages.AuthorizationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static foodnow.core.BaseHelper.driver;

public class AuthorizationPageSteps {


   @And("Пользователь нажимает на link Login")
    public void userClickOnLinkLogin() {
       new AuthorizationPage(driver).clickOnLinkLogin();

   }

    @Then("Пользователь проверяет отображение сообщения об успешном логине")
    public void userVerifiesSuccessfulLoginMessage() {
       new AuthorizationPage(driver).verifyTextMessage();
    }

    @Then("Пользователь проверяет отображение сообщения об неуспешном логине")
    public void userVerifyDisplayMessageInvalidLogin() {
       new AuthorizationPage(driver).verifyTextMessageInvalidLogin();
    }

    @And("Пользователь нажимает на link Registration")
    public void userClickOnLinkRegistration() {
       new AuthorizationPage(driver).clickOnLinkRegistration();
    }

    @And("Пользователь вводит full valid data")
    public void userTypeFullValidData() {
       new AuthorizationPage(driver).typeFullValidData("Ivan",
               "Ivanov",

               System.currentTimeMillis() +"testqa@qwe.com",
               "Password!!@1",
                "+31" + System.currentTimeMillis());
    }

    @And("Пользователь нажимает на button Registration")
    public void userClickOnButtonRegistration() {
         new AuthorizationPage(driver).clickOnButtonRegistration();
    }

    @Then("Пользователь переходит на страницу Логин")
    public void userToTheLoginPage() {
         new AuthorizationPage(driver).toTheLoginPage();
    }
}
