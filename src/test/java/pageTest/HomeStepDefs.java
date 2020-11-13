package pageTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.HomePage;

public class HomeStepDefs {

    private final HomePage homePage;

    public HomeStepDefs(HomePage homePage){
        this.homePage = homePage;
    }

    @Then("I am taken to Home page")
    public void takenToHome() {
        String pageTitle = homePage.homeTitleLbl().getInnerText();
        String expected = "Manual del Sitio";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + pageTitle + ", Actual: " + expected +"\n");
    }

    @Given("I am at Home page")
    public void beOnHome() {
        String pageTitle = homePage.homeTitleLbl().getInnerText();
        String expected = "Manual del Sitio";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + pageTitle + ", Actual: " + expected +"\n");
    }
}
