package pageObjects;

import controls.Label;
import driver.DriverManager;
import org.openqa.selenium.By;

public class TallerPage extends BasePage {

    public TallerPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Label tallerTitleLbl() {
        return new Label(By.xpath("//h2"), super.manager);
    }
}
