package com.capacitacion.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPages extends PageObject {

    @FindBy(name = "user")
    private WebElementFacade txtUser;

    @FindBy(name = "password")
    private WebElementFacade txtPass;

    @FindBy(xpath = "//input[contains(@class,'button')]")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "//div[@id='available']/h2")
    private WebElementFacade LblMensaje;

    public LoginPages(WebDriver driver){

        super(driver);
    }

    public void login(){
        txtUser.sendKeys("test");
        txtPass.sendKeys("secret");
        btnLogin.click();

    }

    public void validarIngreso(){

        MatcherAssert.assertThat("nose inicio sesion", LblMensaje.isDisplayed());
    }



}
