package tests.myAndroid;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.basePageWikipedia.BasePageWikipedia;

import static com.codeborne.selenide.Selenide.$;


@Tag("myAndroid_android")
public class MyAndroidTests extends MyAndroidTestBase {
    public SelenideElement theJumpButtonOnFirstCoverPageLocator = $(MobileBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 4 of 4\"]/android.widget.LinearLayout/android.widget.LinearLayout[1]"));
    public SelenideElement theFirstTextOnTheCoverPageLocator = $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"));
    public String theFirstTextOnTheFirstCoverPage = "The Free Encyclopedia …in over 300 languages";
    public SelenideElement theJumpButtonOnSecondCoverPageLocator = $(MobileBy.xpath("//android.widget.LinearLayout[2]"));
    public String theFirstTextOnTheSecondCoverPage = "New ways to explore";
    public SelenideElement theJumpButtonOnThirdCoverPageLocator = $(MobileBy.xpath("//android.widget.LinearLayout[3]"));
    public String theFirstTextOnTheThirdCoverPage = "Reading lists with sync";
    public SelenideElement theJumpButtonOnFourthCoverPageLocator = $(MobileBy.xpath("//android.widget.LinearLayout[4]"));
    public String theFirstTextOnTheFourthCoverPage = "Send anonymous data";

    @DisplayName("Checking the text on the first cover page")
    @Test
    void testTheTextOnThe1FirstCoverPage() {
        BasePageWikipedia.clickOnElement(theJumpButtonOnFirstCoverPageLocator);
        BasePageWikipedia.checkText(theFirstTextOnTheCoverPageLocator, theFirstTextOnTheFirstCoverPage);
    }

    @DisplayName("Checking the text on the second cover page")
    @Test
    void testTheTextOnTheSecondCoverPage() {
        BasePageWikipedia.clickOnElement(theJumpButtonOnSecondCoverPageLocator);
        BasePageWikipedia.checkText(theFirstTextOnTheCoverPageLocator, theFirstTextOnTheSecondCoverPage);
    }

    @DisplayName("Checking the text on the third cover page")
    @Test
    void testTheTextOnTheThirdCoverPage() {
        BasePageWikipedia.clickOnElement(theJumpButtonOnThirdCoverPageLocator);
        BasePageWikipedia.checkText(theFirstTextOnTheCoverPageLocator, theFirstTextOnTheThirdCoverPage);
    }

    @DisplayName("Checking the text on the fourth cover page")
    @Test
    void testTheTextOnTheFourthCoverPage() {
        BasePageWikipedia.clickOnElement(theJumpButtonOnFourthCoverPageLocator);
        BasePageWikipedia.checkText(theFirstTextOnTheCoverPageLocator, theFirstTextOnTheFourthCoverPage);
    }
}