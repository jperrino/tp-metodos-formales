package pageObjects;

import controls.Label;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class TallerPage extends BasePage {

    public TallerPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Label tallerTitleLbl() {
        try {
            return new Label(By.xpath("//h2"), super.manager);
        }
        catch(NoSuchElementException e) {
            System.out.println("Element "+ this.getClass().getEnclosingMethod() +" not found");
            return null;
        }
    }
}
