package org.tests;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.appium.SelenideAppium;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.Test;
import org.openqa.selenium.By;
import org.providers.SauceLabsAndroidAppProvider;
import org.providers.SauceLabsiOSAppProvider;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.appium.SelenideAppium.$;

public class Demo {
    @Test
     public void androidLaunchTest() {
        Configuration.browser = SauceLabsAndroidAppProvider.class.getName();
        SelenideAppium.launchApp();
        $(AppiumBy.accessibilityId("open menu")).click();

    }
    @Test
    public void iosLaunchTest(){
        Configuration.browser = SauceLabsiOSAppProvider.class.getName();
        SelenideAppium.launchApp();
       $$(By.name("store item text")).get(0).click();
    }


}
