package tests.browserstack;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;


@Tag("browserStack_android")
public class BrowserStackAndroidSelenideTests extends TestBase {
    @Epic("Поиск")
    @Feature("Поиск на главной странице")
    @Story("Поиск BrowserStack")
    @Owner("SimplePerson")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Успешный поиск в википедии приложения андроида")
    @Description("Пропверям ,что в википедии поиск обработал наш запрос")
    @Test
    void searchTest() {
        step("Поиск", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
        });
        step("Проверяем, что поиск выдал результат", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Epic("Главная страница")
    @Feature("Логотип")
    @Story("Логотип Wikipedia")
    @Owner("SimplePerson")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Есть логотип Wikipedia")
    @Description("Пропверям ,что есть логотип на главной странице")
    @Tag("mobile")
    @Test
    void logoSearchTest() {
        step("Логотип Wikipedia найден", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/single_fragment_toolbar_wordmark"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}
