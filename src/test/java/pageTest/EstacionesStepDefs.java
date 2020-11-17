package pageTest;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.EstacionesPage;

public class EstacionesStepDefs {

    private final EstacionesPage estacionesPage;

    public EstacionesStepDefs(EstacionesPage estacionesPage){
        this.estacionesPage = estacionesPage;
    }

    @Then("I am taken to Estaciones page")
    public void takenToEstaciones() {
        String pageTitle = estacionesPage.estacionesTitleLbl().getInnerText();
        String expected = "Estaciones";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + expected + ", Actual: " + pageTitle +"\n");
    }

    @Then("Estacion with nombre: {string} is present")
    public void nombreIsPresent(String nombre){
        estacionesPage.addTableItem(nombre);
        Assert.assertTrue(estacionesPage.getTableItem(nombre).isDisplayed());
    }
}
