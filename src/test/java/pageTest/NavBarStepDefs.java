package pageTest;

import io.cucumber.java.en.Given;
import pageObjects.NavBar;

public class NavBarStepDefs {

    private final NavBar nav;

    public NavBarStepDefs(NavBar nav){
        this.nav = nav;
    }

    @Given("I click on Taller")
    public void clickTaller(){
        nav.tallerBtn().click();
    }

    @Given("I click on Alta Unidades")
    public void clickAltaUnidades(){
        nav.tallerDropdownBtn().click();
        nav.altaUnidadesBtn().click();
    }

    @Given("I click on Alta Servicios")
    public void clickAltaServicios(){
        nav.listadoServiciosDropdownBtn().click();
        nav.altaServiciosBtn().click();
    }

    @Given("I click on Alta Estacion")
    public void clickAltaEstacion(){
        nav.estacionesDropdownBtn().click();
        nav.altaEstacionBtn().click();
    }
}
