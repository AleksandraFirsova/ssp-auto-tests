package com.alsfirsova.page.propeller;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CampaignsEditPage {
    private SelenideElement inputCampaignName = $("#adv-campaign-name");
    private SelenideElement inputTargetUrl = $("#adv-campaign-target-url");
    private SelenideElement inputCountries = $("#adv-campaign-targeting-country-0");
    private SelenideElement inputCPA = $("#adv-campaign-amount-rate-0");

    @Step("Проверяется результат заполнения обязательных полей при PricingModel == CPA || CPM")
    public void checkResultFillingRequiredFieldsForCPAAndCPM(String expectedName
            , String expectedTargetUrl
            , String expectedCountries
            , String expectedCPA) {
        inputCampaignName.shouldHave(Condition.value(expectedName));
        inputTargetUrl.shouldHave(Condition.value(expectedTargetUrl));
        inputCountries.shouldHave(Condition.text(expectedCountries));
        inputCPA.shouldHave(Condition.value(expectedCPA));
    }

    @Step("Проверяется результат заполнения обязательных полей при PricingModel == Smart CPM")
    public void checkResultFillingRequiredFieldsForSmartCPM(String expectedName
            , String expectedTargetUrl
            , String expectedCountries) {
        inputCampaignName.shouldHave(Condition.value(expectedName));
        inputTargetUrl.shouldHave(Condition.value(expectedTargetUrl));
        inputCountries.shouldHave(Condition.text(expectedCountries));
    }

    @Step("Проверяется результат заполнения обязательных полей")
    public void checkResultFillingRequiredFields(PricingModel type
            , String expectedName) {
        if (type.equals(PricingModel.CPA_GOAL) || type.equals(PricingModel.CPM)) {
            checkResultFillingRequiredFieldsForCPAAndCPM(expectedName
                    , "http://www.domain.com/in.php?clickid=${SUBID}"
                    , "Russian Federation"
                    , "100");
        }

        if (type.equals(PricingModel.SMART_CPM)) {
            checkResultFillingRequiredFieldsForSmartCPM(expectedName
                    , "http://www.domain.com/in.php?clickid=${SUBID}"
                    , "Russian Federation");
        }
    }
}
