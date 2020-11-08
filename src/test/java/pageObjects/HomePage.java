package pageObjects;

import controls.Label;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class HomePage extends BasePage {

    public HomePage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Label homeTitleLbl() {
        try {
            return new Label(By.id("home-title"), super.manager);
        }
        catch(NoSuchElementException e) {
            System.out.println("Element "+ this.getClass().getEnclosingMethod() +" not found");
            return null;
        }
    }
}
