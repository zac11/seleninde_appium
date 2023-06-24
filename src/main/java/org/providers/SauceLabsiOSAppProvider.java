package org.providers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsiOSAppProvider implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        XCUITestOptions options  = new XCUITestOptions();
        options.setDeviceName("iphone 14");
        options.setApp(System.getProperty("user.dir")+"/apps/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");
        try {
            return new IOSDriver(new URL("http://127.0.0.1:4723/"),options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
