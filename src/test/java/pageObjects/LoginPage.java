package pageObjects;

import controls.Button;
import controls.TextBox;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class LoginPage extends BasePage {

    public LoginPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public TextBox usernameTxtb() {
        try {
            return new TextBox(By.xpath("//input[@type='text']"), super.manager);
        }
        catch(NoSuchElementException e) {
            System.out.println("Element "+ this.getClass().getEnclosingMethod() +" not found");
            return null;
        }
    }

    public TextBox passwordTxtb() {
        try {
            return new TextBox(By.xpath("//input[@type='password']"), super.manager);
        }
        catch(NoSuchElementException e) {
            System.out.println("Element "+ this.getClass().getEnclosingMethod() +" not found");
            return null;
        }
    }

    public Button loginBtn() {
        try {
            return new Button(By.xpath("//input[@type='Submit']"), super.manager);
        }
        catch(NoSuchElementException e) {
            System.out.println("Element "+ this.getClass().getEnclosingMethod() +" not found");
            return null;
        }
    }
}