package controls;

import driver.DriverManager;
import org.openqa.selenium.By;

public class TableItem extends BaseControl {

    private String itemText;

    public TableItem(String text, DriverManager manager) {
        super(By.xpath("//tbody/tr/td[text()='" + text + "']"), manager);
    }

    public void setItemText(String text){
        this.itemText = text;
    }

    public String getItemText(){
        return this.itemText;
    }

    public String getText()
    {
        return webElement().getAttribute("value");
    }

    public String getInnerText()
    {
        return webElement().getAttribute("innerHTML");
    }

    public Boolean isDisplayed(){
        return webElement().isDisplayed();
    }
}
