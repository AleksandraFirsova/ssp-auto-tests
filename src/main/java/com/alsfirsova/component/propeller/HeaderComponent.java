package com.alsfirsova.component.propeller;

import com.alsfirsova.page.propeller.CampaignsCreatePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {
    private SelenideElement buttonCreateCampaign = $("#adv-header-create-campaign-button");

    @Step("Нажатие на кнопку создания кампании")
    public CampaignsCreatePage clickButtonCreateCampaign() {
        buttonCreateCampaign.click();
        return new CampaignsCreatePage();
    }
}
