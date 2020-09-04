package com.alsfirsova.component.propeller;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CampaignsTableComponent {
    private ElementsCollection rowsCampaigns = $$(".rt-tr-group");
    private SelenideElement textCampaigns = $(".PageHeader__title h1");

    @Step("Открыть страницу кампании {position}")
    public CampaignsTableComponent clickCampaignName(int position) {
        textCampaigns.shouldBe(Condition.visible).shouldHave(Condition.text("Campaigns"));
        rowsCampaigns.get(position).$(".CampaignsListTableName__name a").click();
        return this;
    }

    @Step("Открыть страницу кампании {name}")
    public CampaignsTableComponent clickCampaignName(String name) {
        textCampaigns.shouldBe(Condition.visible).shouldHave(Condition.text("Campaigns"));
        rowsCampaigns.find(Condition.text(name)).$(".CampaignsListTableName__name a").click();
        return this;
    }

    @Step("Проверяется изменения названия кампании {expectedResult}")
    public CampaignsTableComponent checkEditCampaignName(int position, String expectedResult) {
        textCampaigns.shouldBe(Condition.visible).shouldHave(Condition.text("Campaigns"));
        rowsCampaigns.get(position).$(".CampaignsListTableName__name a").shouldHave(Condition.text(expectedResult));
        return this;
    }

    @Step("Проверяется создание кампании {expectedResult}")
    public CampaignsTableComponent checkCreateCampaignName(int position, String expectedResult) {
        rowsCampaigns.get(position).$(".CampaignsListTableName__name a").shouldHave(Condition.text(expectedResult));
        return this;
    }
}
