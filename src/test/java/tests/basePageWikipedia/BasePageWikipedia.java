package tests.basePageWikipedia;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class BasePageWikipedia {
    @Step("Нажимаем на элемент {locator} на странице")
    public static void clickOnElement(SelenideElement locator) {
        locator.click();
    }

    @Step("Проверка текста {text} на странице в месте {locator}")
    public static void checkText(SelenideElement locator, String text) {
        locator.shouldHave(Condition.text(text));
    }
}
