package pageObjects;

import controls.Button;
import controls.TextBox;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AltaEstacionPage extends BasePage{
    public AltaEstacionPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Select localidadSel(){
        return new Select(super.manager.getDriver().findElement(By.id("input-localidad")));
    }

    public TextBox nombreTxtb(){
        return new TextBox(By.id("input-estacion"),super.manager);
    }

    public TextBox direccionTxtb(){
        return new TextBox(By.id("input-direccion"),super.manager);
    }

    public TextBox telefonoTxtb(){
        return new TextBox(By.id("input-telefono"),super.manager);
    }

    public Button guardarBtn(){
        return new Button(By.xpath("//input[@value='Guardar']"),super.manager);
    }
}
