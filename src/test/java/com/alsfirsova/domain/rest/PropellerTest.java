package com.alsfirsova.domain.rest;

import com.alsfirsova.jupiter.AllureScreenshotExtension;
import com.alsfirsova.page.propeller.Campaign;
import com.alsfirsova.page.propeller.CampaignsPage;
import com.alsfirsova.page.propeller.PricingModel;
import com.alsfirsova.page.propeller.ProfilePage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

@ExtendWith({AllureScreenshotExtension.class})
class PropellerTest {
    private LoginService service = new LoginService();
    private static final String URL = "https://partners.propellerads.com/";
    private final SelenideElement cookieConsentButton = $("button#cookie-consent");

    @BeforeEach
    void setUp() {
        Selenide.open(URL);
        if(cookieConsentButton.exists()) {
            cookieConsentButton.click();
        }
    }

    @AfterEach
    void close() {
        Selenide.closeWebDriver();
    }

    @DisplayName("Отображается правильная информация о пользователе в разделе \"Профайл\"")
    @Test
    void checkProfileInfoTest() {
        service.login("alsfirsova@gmail.com", "1q2w3e4r1Q!");
        Selenide.open(ProfilePage.URL, ProfilePage.class)
                .checkUserInfo("79218665714", "alsfirsova@gmail.com");
    }

    @EnumSource(PricingModel.class)
    @DisplayName("Создание кампании")
    @ParameterizedTest
    void createdCampaignTest(PricingModel type) {
        Campaign campaign = new Campaign(type)
                .withName("Test" + new Random().nextInt())
                .withUrlCampaign("http://www.domain.com/in.php?clickid=${SUBID}")
                .withCountriesCampaign("Russian Federation", "Albania")
                .withCpaCampaign("100");

        service.login("alsfirsova@gmail.com", "1q2w3e4r1Q!");
        Selenide.open(CampaignsPage.URL, CampaignsPage.class)
                .redirectToCreatePage()
                .fillingFields(campaign)
                .clickCheckboxAgreement()
                .clickButtonSaveAsDraft()
                .openCampaignName(campaign.getName())
                .checkResultFillingRequiredFields(campaign.getPricingModel(), campaign.getName());
    }
}

