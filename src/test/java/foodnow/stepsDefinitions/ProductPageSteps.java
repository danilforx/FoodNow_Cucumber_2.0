package foodnow.stepsDefinitions;

import foodnow.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static foodnow.core.BaseHelper.driver;

public class ProductPageSteps {


    @Then("Пользователь проверяет наличие описания товара")
    public void userChecksForProductDescription() {
        new ProductPage(driver).verifyProductDescription();
    }

    @And("Пользователь добавляет товар в корзину")
    public void userAddProductInCart() {
        new ProductPage(driver).clickAddToCart();
    }

}
