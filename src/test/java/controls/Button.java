package controls;

import driver.DriverManager;
import org.openqa.selenium.By;

public class Button extends  BaseControl {

    public Button(By by, DriverManager manager) {
        super(by, manager);
    }

    public void click() {
        webElement().click();
    }

    public String getText() {
        return webElement().getText();
    }
}

