package pageTest;

import io.cucumber.java.en.Given;
import pageObjects.AltaUnidadesPage;

public class AltaUnidadesStepDefs {

    private final AltaUnidadesPage altaUnidadesPage;

    public AltaUnidadesStepDefs(AltaUnidadesPage altaUnidadesPage){
        this.altaUnidadesPage = altaUnidadesPage;
    }

    @Given("I set {string} as patente")
    public void setPatente(String patente){
        altaUnidadesPage.patenteTxtb().setText(patente);
    }

    @Given("I set {string} as fecha de patentamiento")
    public void setFechaPatentamiento(String fechaPatentamiento){
        altaUnidadesPage.fechaPatentamientoTxtb().setText(fechaPatentamiento);
    }

    @Given("I set {string} as asientos cama")
    public void setAsientosCama(String asientosCama){
        altaUnidadesPage.asientosCamaTxtb().setText(asientosCama);
    }

    @Given("I set {string} as asientos semi cama")
    public void setAsientosSemiCama(String asientosSemiCama){
        altaUnidadesPage.asientosSemiCamaTxtb().setText(asientosSemiCama);
    }

    @Given("I set {string} as tipo unidad")
    public void setTipoUnidad(String tipoUnidad){
        altaUnidadesPage.tipoUnidadSel().selectByVisibleText(tipoUnidad);
    }

    @Given("I click Guardar")
    public void clickGuardar(){
        altaUnidadesPage.guardarBtn().click();
        //altaUnidadesPage.confirmAlert();
    }
}
