package pageTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LoginPage;

public class LoginStepDefs {

    private final LoginPage loginPage;

    public LoginStepDefs(LoginPage loginPage){
        this.loginPage = loginPage;
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

    @Given("I login successfully")
    public void loginSuccessful(){
        loginPage.usernameTxtb().setText("test");
        loginPage.passwordTxtb().setText("test");
        loginPage.loginBtn().click();
    }

    @Then("I remain at Login page")
    public void remainOnLogin() {
        String pageTitle = loginPage.loginTitleLbl().getInnerText();
        String expected = "Iniciar Sesion";
        Assert.assertTrue(pageTitle.equals(expected),
                "Expected: " + pageTitle + ", Actual: " + expected +"\n");
    }
}
