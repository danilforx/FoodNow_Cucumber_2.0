package foodnow.stepsDefinitions;

import foodnow.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static foodnow.core.BaseHelper.driver;


public class HomePageSteps {

    @Given("Пользователь запускает браузер")
    public void userLaunchesBrowser(){
        new HomePage(driver).launchBrowser();
    }

    @When("Пользователь открывает домашнюю страницу foodnow")
    public void userOpenHomePageFoodNow() {
        new HomePage(driver).openHomePage();
    }

    @And("Пользователь кликает на Иконку авторизации")
    public void userClickOnIconAuthorization() {
        new HomePage(driver).clickOnIconAuthorization();
    }

    @After
    @And("Пользователь закрывает браузер")
    public void userCloseBrowser() {
        new HomePage(driver).quitBrowser();
    }

    @Then("Проверить, что заголовок домашней страницы отображается")
    public void verifyTitleHomePageIsDisplay() {
        new HomePage(driver).verifyTitleHomePage();
    }

    @And("Пользователь кликает на логотип FoodNow")
    public void userClickOnImageFoodNow() {
        new HomePage(driver).clickOnImageFoodNow();
    }

    @And("Пользователь скроллит страницу продуктов")
    public void userScrollPageProductsAndClickProductAddToCart() {
        new HomePage(driver).scrollPageProducts();
    }

    @And("Пользователь кликает на продукт {string}")
    public void userClickOnProduct(String product) {
        new HomePage(driver).clickOnProduct(product);
    }

    @And("Пользователь кликает на категорию")
    public void userClickOnCategoriesSeafood() {
        new HomePage(driver).clickOnCategoriesSeafood();
    }

    @And("Пользователь click on button AddToCart")
    public void userClickOnButtonAddToCart() {
        new HomePage(driver).clickOnButtonAddToCart();
    }

    @And("Пользователь кликает на Cart")
    public void userClickOnCart() {
        new HomePage(driver).clickOnCart();
    }
}
