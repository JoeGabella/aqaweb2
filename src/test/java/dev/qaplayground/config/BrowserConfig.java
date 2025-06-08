package dev.qaplayground.config;

import com.codeborne.selenide.Configuration;

public class BrowserConfig {

    public static void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
    }

}
