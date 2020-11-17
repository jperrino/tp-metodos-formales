package pageTest;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.TallerPage;

public class TallerStepDefs {

    private final TallerPage tallerPage;

    public TallerStepDefs(TallerPage tallerPage){
        this.tallerPage = tallerPage;
    }

    @Then("I am taken to Taller page")
    public void takenToTaller() {
        String pageTitle = tallerPage.tallerTitleLbl().getInnerText();
        String expected = "Taller";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + expected + ", Actual: " + pageTitle +"\n");
    }

    @Then("Unidad with patente: {string} is present")
    public void patenteIsPresent(String patente){
        tallerPage.addTableItem(patente);
        Assert.assertTrue(tallerPage.getTableItem(patente).isDisplayed());
    }
}
