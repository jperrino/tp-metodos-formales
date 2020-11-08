package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.By;

public class BasePage {

    protected By by;
    protected DriverManager manager;

    public BasePage(By by, DriverManager manager) {
        this.by = by;
        this.manager = manager;
    }

    public String getTitle()
    {
        return manager.getDriver().getTitle();
    }
}
