package pageObjects;

import controls.Label;
import controls.TableItem;
import driver.DriverManager;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class TallerPage extends BasePage {

    private List<TableItem> tableItems = new ArrayList<TableItem>();

    public TallerPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Label tallerTitleLbl() {
        return new Label(By.xpath("//h2"), super.manager);
    }

    public void addTableItem(String itemText){
        tableItems.add(new TableItem(itemText, super.manager));
    }

    public TableItem getTableItem(String itemText){
        TableItem item = null;
        for (TableItem t: tableItems) {
            if(t.getInnerText().equals(itemText)){
                item = t;
            }
        }
        return item;
    }

}
