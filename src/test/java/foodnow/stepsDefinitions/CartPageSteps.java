package foodnow.stepsDefinitions;

import foodnow.pages.CartPage;
import io.cucumber.java.en.And;

import static foodnow.core.BaseHelper.driver;

public class CartPageSteps {



    @And("Пользователь увеличивает колличество товара в корзине")
    public void userIncreasesTheQuantityOfGoodsInTheCart() {
        new CartPage(driver).increaseQuantityOfGoodsInTheCart();
    }

    @And("Пользователь удаляет товар из корзины")
    public void userDeleteProductCart() {
        new CartPage(driver).deleteProductCart();
    }

    @And("Пользователь наживает на кнопку ProceedToCheckout")
    public void userClickOnButtonProceedToCheckout() {
        new CartPage(driver).proceedToCheckout();
    }
}
