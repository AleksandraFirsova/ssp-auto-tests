package com.alsfirsova.page.propeller;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public static final String URL = "https://partners.propellerads.com/#/app/profile/";
    private SelenideElement inputEmail = $("#adv-profile-input-email");
    private SelenideElement inputPhone = $("#adv-profile-input-phone-number");

    @Step("Отображаются верные значения {phone}, {email} в полях Phone и Email")
    public ProfilePage checkUserInfo(String phone, String email) {
        inputEmail.shouldHave(Condition.value(email));
        inputPhone.shouldHave(Condition.value(phone));
        return this;
    }
}
