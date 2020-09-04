package com.alsfirsova.page.propeller;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CampaignsCreatePage {
    private SelenideElement inputCampaignName = $("#adv-campaign-name");
    private SelenideElement inputTargetUrl = $("#adv-campaign-target-url");
    private SelenideElement clickSelectConversionType = $("#adv-campaign-conversion-type");
    private SelenideElement selectConversionType = $(".css-dpec0i-option");
    private SelenideElement inputCountries = $("#adv-campaign-targeting-country-0 input");
    private SelenideElement inputCPAGoal = $("#adv-campaign-amount-rate-0");
    private SelenideElement radioButtonCPM = $("label[for=adv-campaign-rate-model-cpm]");
    private SelenideElement radioButtonSmartCPM = $("label[for=adv-campaign-rate-model-scpm]");
    private SelenideElement checkboxAgreement = $("label[for = 'adv-campaign-terms-checkbox']");
    private SelenideElement buttonSaveAsDraft = $("#adv-campaign-save-draft");

    @Step("Заполнение поля с названием кампании")
    public CampaignsCreatePage fillingInputNameCampaign(String valueName) {
        inputCampaignName.setValue(valueName);
        return this;
    }

    @Step("Выбор радиобаттона CPM")
    public CampaignsCreatePage selectRadioButtonCPM() {
        radioButtonCPM.click();
        return this;
    }

    @Step("Выбор радиобаттона Smart CPM")
    public CampaignsCreatePage selectRadioButtonSmartCPM() {
        radioButtonSmartCPM.click();
        return this;
    }

    @Step("Заполнение поля 'Целевая страница'")
    public CampaignsCreatePage fillingInputTargetUrlCampaign(String valueTargetUrl) {
        inputTargetUrl.setValue(valueTargetUrl);
        return this;
    }

    @Step("Выбор селекта 'Conversion Type'")
    public CampaignsCreatePage fillingInputConversionType() {
        clickSelectConversionType.click();
        selectConversionType.click();
        return this;
    }

    @Step("Заполнение поля 'Страны'")
    public CampaignsCreatePage fillingInputCountriesCampaign(String[] valueCountries) {
        for (String country: valueCountries) {
            inputCountries.setValue(country).pressEnter();
        }
        return this;
    }

    @Step("Заполнение поля 'CPA'")
    public CampaignsCreatePage fillingInputCPACampaign(String valueCPA) {
        inputCPAGoal.setValue(valueCPA);
        return this;
    }

    @Step("Выбор чекбокса")
    public CampaignsCreatePage clickCheckboxAgreement() {
        checkboxAgreement.click();
        return this;
    }

    @Step("Нажатие кнопки 'Save As Draft'")
    public CampaignsPage clickButtonSaveAsDraft() {
        buttonSaveAsDraft.click();
        return new CampaignsPage();
    }

    @Step("Заполнение полей при Pricing Model == CPA_GOAL")
    public CampaignsCreatePage fillingFieldsForCPA(String valueName,
                                              String valueTargetUrl,
                                              String[] valueCountries,
                                              String valueCPA) {
       return fillingInputNameCampaign(valueName)
                .fillingInputTargetUrlCampaign(valueTargetUrl)
                .fillingInputConversionType()
                .fillingInputCountriesCampaign(valueCountries)
                .fillingInputCPACampaign(valueCPA);
    }

    @Step("Заполнение полей при Pricing Model == CPM")
    public CampaignsCreatePage fillingFieldsForCPM(String valueName,
                                              String valueTargetUrl,
                                              String[] valueCountries,
                                              String valueCPA) {
        return selectRadioButtonCPM()
                .fillingInputNameCampaign(valueName)
                .fillingInputTargetUrlCampaign(valueTargetUrl)
                .fillingInputCountriesCampaign(valueCountries)
                .fillingInputCPACampaign(valueCPA);
    }

    @Step("Заполнение полей при Pricing Model == Smart CPM")
    public CampaignsCreatePage fillingFieldsForSmartCPM(String valueName,
                                                   String valueTargetUrl,
                                                   String[] valueCountries) {
        return selectRadioButtonSmartCPM()
                .fillingInputNameCampaign(valueName)
                .fillingInputTargetUrlCampaign(valueTargetUrl)
                .fillingInputCountriesCampaign(valueCountries);
    }

    @Step("Заполнение полей в зависимости от Pricing Model")
    public CampaignsCreatePage fillingFields(Campaign campaign) {

        if (campaign.getPricingModel() == PricingModel.CPA_GOAL) {
           return fillingFieldsForCPA(campaign.getName()
                    , campaign.getUrlCampaign()
                    , campaign.getCountriesCampaign()
                    , campaign.getCpaCampaign());
        }
        if (campaign.getPricingModel() == PricingModel.CPM) {
            return fillingFieldsForCPM(campaign.getName()
                    , campaign.getUrlCampaign()
                    , campaign.getCountriesCampaign()
                    , campaign.getCpaCampaign());
        }
        if (campaign.getPricingModel() == PricingModel.SMART_CPM) {
            return fillingFieldsForSmartCPM(campaign.getName()
                    , campaign.getUrlCampaign()
                    , campaign.getCountriesCampaign());
        }
         throw new IllegalArgumentException("Pricing Model not support here");
    }
}
