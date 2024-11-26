package foodnow.stepsDefinitions;

import foodnow.pages.OrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static foodnow.core.BaseHelper.driver;

public class OrderPageSteps {


    @Then("Пользователь убеждается что он находится на странице Order checkout")
    public void userIsOnOrderCheckoutPage() {
        new OrderPage(driver).assertPaymet();
    }

    @And("Пользователь вводит адрес доставки")
    public void userTypeAddressDelivery() {
        new OrderPage(driver).enterAddress();
    }


    @And("Пользователь кликает на Payment method")
    public void userClickOnPaymentMethod() {
        new OrderPage(driver).clickSubmitOrder();
    }

    @And("Пользователь выбирает способ оплаты")
    public void userSelectPayPal() {
        new OrderPage(driver).selectPayPal();
    }

    @And("Пользователь наживает на кнопку Submit order")
    public void userAddOnButtonSubmitOrder() {
        new OrderPage(driver).chooseSubmitOrder();
    }

    @Then("Пользователь убеждается что он находится на странице оплаты")
    public void userSureHeIsOnThePaymentPage() {
        new OrderPage(driver).checkedPaymet();
    }
}
