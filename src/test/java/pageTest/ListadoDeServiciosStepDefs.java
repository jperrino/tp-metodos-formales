package pageTest;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.ListadoDeServiciosPage;

public class ListadoDeServiciosStepDefs {

    private final ListadoDeServiciosPage listadoDeServiciosPage;

    public ListadoDeServiciosStepDefs(ListadoDeServiciosPage listadoDeServiciosPage){
        this.listadoDeServiciosPage = listadoDeServiciosPage;
    }

    @Then("I am taken to Listado de Servicios page")
    public void takenToListadoDeServicios() {
        String pageTitle = listadoDeServiciosPage.listadoDeServiciosTitleLbl().getInnerText();
        String expected = "Listado de Servicios";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + expected + ", Actual: " + pageTitle +"\n");
    }

    @Then("Servicio with hora de partida: {string} is present")
    public void horaPartidaIsPresent(String horaPartida){
        listadoDeServiciosPage.addTableItem(horaPartida);
        Assert.assertTrue(listadoDeServiciosPage.getTableItem(horaPartida).isDisplayed());
    }
}
