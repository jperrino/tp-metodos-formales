package controls;

import driver.DriverManager;
import org.openqa.selenium.By;

public class Label extends BaseControl {

    public Label(By by, DriverManager manager) {
        super(by, manager);
    }

    public String getText()
    {
        return webElement().getAttribute("value");
    }

    public String getInnerText()
    {
        return webElement().getAttribute("innerHTML");
    }
}
