package controls;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

public class BaseControl {
    protected By by;
    protected DriverManager manager;

    public BaseControl(By by, DriverManager manager) {
        this.by = by;
        this.manager = manager;
    }

    protected WebElement webElement() {
        try{
            return this.manager.getDriver().findElement(this.by);
        }
        catch (NoSuchElementException e){
            new Assertion().fail("Element could not be found using locator: "+ this.by);
            return null;
        }
    }
}

