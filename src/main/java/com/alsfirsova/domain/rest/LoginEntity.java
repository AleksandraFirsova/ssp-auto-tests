package com.alsfirsova.domain.rest;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LoginEntity {
    @SerializedName("Login")
    private String login;
    private String password;
    private static transient Gson gson = new Gson();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toJSON() {
        return "{\n" +
                "  \"Login\":" + getLogin() + ",\n" +
                "  \"Password\":" + getPassword() + "}";
    }

    public String toRealJson() {
        return gson.toJson(this);
    }


    public static void main(String[] args) {
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setLogin("userName");
        loginEntity.setPassword("userPassword");
        System.out.println(loginEntity.toJSON());
        System.out.println(loginEntity.toRealJson());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginEntity that = (LoginEntity) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }
}
