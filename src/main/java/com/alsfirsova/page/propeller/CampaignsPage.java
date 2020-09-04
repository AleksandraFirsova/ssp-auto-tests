package com.alsfirsova.page.propeller;

import com.alsfirsova.component.propeller.CampaignsTableComponent;
import com.alsfirsova.component.propeller.HeaderComponent;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class CampaignsPage {
    public static final String URL = "https://partners.propellerads.com/#/app/campaigns";
    private CampaignsTableComponent campaignsTableComponent = new CampaignsTableComponent();
    private HeaderComponent headerComponent = new HeaderComponent();

    @Step("Открытие страницы кампании {name}")
    public CampaignsEditPage openCampaignName(String name) {
        campaignsTableComponent.clickCampaignName(name);
        return new CampaignsEditPage();
    }

    @Step("Клик на кнопку 'Создание кампании'")
    public CampaignsCreatePage redirectToCreatePage() {
        headerComponent.clickButtonCreateCampaign();
        return new CampaignsCreatePage();
    }
}
