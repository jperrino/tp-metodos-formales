package pageTest;

import io.cucumber.java.en.Given;
import pageObjects.AltaEstacionPage;

public class AltaEstacionStepDefs {

    private final AltaEstacionPage altaEstacionPage;

    public AltaEstacionStepDefs(AltaEstacionPage altaEstacionPage){
        this.altaEstacionPage = altaEstacionPage;
    }

    @Given("I set {string} as localidad")
    public void setLocalidad(String localidad){
        altaEstacionPage.localidadSel().selectByVisibleText(localidad);
    }

    @Given("I set {string} as nombre")
    public void setNombre(String nombre){
        altaEstacionPage.nombreTxtb().setText(nombre);
    }

    @Given("I set {string} as direccion")
    public void setDireccion(String direccion){
        altaEstacionPage.direccionTxtb().setText(direccion);
    }

    @Given("I set {string} as telefono")
    public void setTelefono(String telefono){
        altaEstacionPage.telefonoTxtb().setText(telefono);
    }

    @Given("I press Guardar")
    public void pressGuardar(){
        altaEstacionPage.guardarBtn().click();
        //altaUnidadesPage.confirmAlert();
    }
}
