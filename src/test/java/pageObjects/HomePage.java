package pageObjects;

import controls.Label;
import driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Label homeTitleLbl() {
        return new Label(By.xpath("//h2"), super.manager);
    }
}
