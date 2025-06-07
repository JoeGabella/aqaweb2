package dev.qaplayground.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class NewTabPage {
    private final SelenideElement openNewTabBtn = $x("//a[text()='Open New Tab']");
}
