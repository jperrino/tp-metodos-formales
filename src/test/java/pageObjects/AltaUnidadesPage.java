package pageObjects;

import controls.Button;
import controls.TextBox;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AltaUnidadesPage extends BasePage {

    public AltaUnidadesPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public TextBox patenteTxtb(){
        return new TextBox(By.id("input-patente"),super.manager);
    }

    public TextBox fechaPatentamientoTxtb(){
        return new TextBox(By.id("input-fecha-patentamiento"),super.manager);
    }

    public TextBox asientosCamaTxtb(){
        return new TextBox(By.id("input-asientos-cama"),super.manager);
    }

    public TextBox asientosSemiCamaTxtb(){
        return new TextBox(By.id("input-asientos-semi"),super.manager);
    }

    public Select tipoUnidadSel(){
        return new Select(super.manager.getDriver().findElement(By.id("select-tipo-unidad")));
    }

    public Button guardarBtn(){
        return new Button(By.id("insert"),super.manager);
    }
}
