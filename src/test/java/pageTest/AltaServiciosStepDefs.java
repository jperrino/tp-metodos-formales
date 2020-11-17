package pageTest;

import io.cucumber.java.en.Given;
import pageObjects.AltaServiciosPage;

public class AltaServiciosStepDefs {

    private final AltaServiciosPage altaServiciosPage;

    public AltaServiciosStepDefs(AltaServiciosPage altaServiciosPage){
        this.altaServiciosPage = altaServiciosPage;
    }

    @Given("I choose {string} as tipo unidad")
    public void chooseTipoUnidad(String tipoUnidad){
        altaServiciosPage.tipoUnidadSel().selectByVisibleText(tipoUnidad);
    }

    @Given("I set {string} as dia de partida")
    public void setDiaPartida(String diaPartida){
        altaServiciosPage.diaPartidaSel().selectByVisibleText(diaPartida);
    }

    @Given("I set {string} as hora de partida")
    public void setHoraPartida(String horaPartida){
        altaServiciosPage.horaDePartidaTxtb().setText(horaPartida);
    }

    @Given("I set {string} as estacion origen")
    public void setEstacionOrigen(String estacionOrigen){
        altaServiciosPage.estacionOrigenSel().selectByVisibleText(estacionOrigen);
    }

    @Given("I set {string} as estacion destino")
    public void setEstacionDestino(String estacionDestino){
        altaServiciosPage.estacionDestinoSel().selectByVisibleText(estacionDestino);
    }

    @Given("I click on Guardar")
    public void clickOnGuardar(){
        altaServiciosPage.guardarBtn().click();
        //altaUnidadesPage.confirmAlert();
    }
}
