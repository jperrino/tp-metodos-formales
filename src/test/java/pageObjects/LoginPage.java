package pageObjects;

import controls.Button;
import controls.Label;
import controls.TextBox;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class LoginPage extends BasePage {

    public LoginPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Label loginTitleLbl() {
        return new Label(By.xpath("//h2"), super.manager);
    }
    public TextBox usernameTxtb() {
        return new TextBox(By.xpath("//input[@type='text']"), super.manager);
    }

    public TextBox passwordTxtb() {
        return new TextBox(By.xpath("//input[@type='password']"), super.manager);
    }

    public Button loginBtn() {
        return new Button(By.xpath("//input[@type='submit']"), super.manager);
    }
}