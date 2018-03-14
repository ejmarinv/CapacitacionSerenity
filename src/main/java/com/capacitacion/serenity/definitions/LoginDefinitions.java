package com.capacitacion.serenity.definitions;

import com.capacitacion.serenity.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LoginDefinitions {

    @Steps
    LoginSteps pasos;

    @Given("que estoy en la aplicacion de training site")
    public void abrirUrl()  {
    pasos.abrirApp();
    }

    @When("inicio sesion")
    public void iniciarSesion(){
    pasos.inicioSesion();
    }

    @Then("accedo a la compra de libros")
    public void validarAcceso(){
    pasos.validarIngreso();
    }

}
