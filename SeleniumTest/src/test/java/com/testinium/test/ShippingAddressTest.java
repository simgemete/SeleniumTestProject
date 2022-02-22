package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import com.testinium.page.ShippingAddressPage;
import com.testinium.page.LoginPage;

import org.junit.Test;

public class ShippingAddressTest extends BaseTest {
    @Test
    public void addressInfoTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage=new ProductPage();
        ShippingAddressPage shippingAddressPage =new ShippingAddressPage();
        loginPage.login();
        productPage.scrollAndSelectProduct();
        shippingAddressPage.addressInfo();

    }
}