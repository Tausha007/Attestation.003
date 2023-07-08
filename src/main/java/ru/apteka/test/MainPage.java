package ru.apteka.test;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement inputFind = $("#title-search-input_fixed");
    SelenideElement countProduct = $(".js-basket-block .count");
    SelenideElement countProductInCart = $(".js-basket-block .wrap .count");

}
