package pageTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.TallerPage;

public class LoginStepDefs {

    private final LoginPage loginPage;
    private final HomePage homePage;
    private final TallerPage tallerPage;

    public LoginStepDefs(LoginPage loginPage, HomePage homePage, TallerPage tallerPage){
        this.loginPage = loginPage;
        this.homePage = homePage;
        this.tallerPage = tallerPage;
    }

    @Given("I write my {string} in the username field")
    public void typeUsername(String username) {
        loginPage.usernameTxtb().setText(username);
    }

    @Given("I write my {string} in the password field")
    public void typePassword(String password) {
        loginPage.passwordTxtb().setText(password);
    }

    @When("I click on the login button")
    public void clickLogin() {
        loginPage.loginBtn().click();
    }

    @Then("I should be taken to {string} page")
    public void shouldGoToHome(String page) {
        String pageTitle = null;
        String expected = null;
        switch(page) {
            case "Home":
                pageTitle = homePage.homeTitleLbl().getInnerText();
                expected = "Manual del Sitio";
                break;
            case "Login":
                pageTitle = loginPage.loginTitleLbl().getInnerText();
                expected = "Iniciar Sesion";
                break;
            default:
                Assert.fail("Ivalid page input: " + page);
        }
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + pageTitle + ", Actual: " + expected +"\n");
    }

    @Then("I should be taken to Taller page")
    public void shouldGoToTaller() {
        String pageTitle = tallerPage.tallerTitleLbl().getInnerText();
        String expected = "Taller";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + pageTitle + ", Actual: " + expected +"\n");
    }
}
