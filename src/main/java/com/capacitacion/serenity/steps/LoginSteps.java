package com.capacitacion.serenity.steps;

import com.capacitacion.serenity.pages.LoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;


public class LoginSteps extends ScenarioSteps{

    @Page
    LoginPages prueba;

    @Step
    public void abrirApp(){
        prueba.open();
    }

    @Step
    public void inicioSesion(){
        prueba.login();
    }

    @Step
    public void validarIngreso(){
        prueba.validarIngreso();
    }


}
