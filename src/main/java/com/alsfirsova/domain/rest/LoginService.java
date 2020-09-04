package com.alsfirsova.domain.rest;

import com.alsfirsova.domain.rest.generated.ResponseEntity;
import com.codeborne.selenide.WebDriverRunner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.qameta.allure.Step;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Cookie;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class LoginService {
    private static transient Gson gson = new Gson();

    public RequestEntity getDefaultRequest() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("loginRequest.json");
        try {
            String jsonFile = IOUtils.toString(inputStream, "UTF-8");
            return RequestEntity.fromJson(jsonFile);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private ResponseEntity sendLoginRequest(RequestEntity requestEntity) throws Exception {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://partners.propellerads.com/v1.0/login_check");
        StringEntity stringEntity = new StringEntity(requestEntity.toJson());
        httpPost.setEntity(stringEntity);
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpPost);
        InputStream inputStream = response.getEntity().getContent();

        try {
            String jsonFile = IOUtils.toString(inputStream, "UTF-8");
            JsonObject fullJsonObject = gson.fromJson(jsonFile, JsonObject.class);
            String innerJsonObject = fullJsonObject.getAsJsonObject("result").toString();
            ResponseEntity result = ResponseEntity.fromJson(innerJsonObject);

            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Step("Выполняется авторизация {login}, {password}")
    public void login(String login, String password) {
        RequestEntity request = getDefaultRequest();
        request.setPassword(password);
        request.setUsername(login);
        try {
            ResponseEntity response = sendLoginRequest(request);
            String cookie = encodeBrowserCookie(response.toJson());
            Cookie cookieObject = new Cookie("user", cookie);
            WebDriverRunner.getWebDriver().manage().addCookie(cookieObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String encodeBrowserCookie(String source) {
        try {
            return URLEncoder.encode(source, "UTF-8")
                    .replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}

