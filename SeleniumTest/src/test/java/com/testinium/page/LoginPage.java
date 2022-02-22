package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){

            methods.click(By.cssSelector(".menu-top-button.login>a"));
            methods.waitBySeconds(1);
            methods.sendKey(By.id("login-email"), "Simgemete1@outlook.com");
            methods.waitBySeconds(1);
            methods.sendKey(By.id("login-password"), "asdfghjk");
            methods.waitBySeconds(1);
            methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
            methods.waitBySeconds(1);
            Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));


    }
}
