package pageObjects;

import controls.Button;
import controls.TextBox;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AltaServiciosPage extends BasePage {
    public AltaServiciosPage(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Select tipoUnidadSel(){
        return new Select(super.manager.getDriver().findElement(By.id("select-tipo-unidad")));
    }

    public Select diaPartidaSel(){
        return new Select(super.manager.getDriver().findElement(By.id("select-dia-partida")));
    }

    public TextBox horaDePartidaTxtb(){
        return new TextBox(By.id("input-hora-partida"),super.manager);
    }

    public Select estacionOrigenSel(){
        return new Select(super.manager.getDriver().findElement(By.id("select-estacion-origen")));
    }

    public Select estacionDestinoSel(){
        return new Select(super.manager.getDriver().findElement(By.id("select-estacion-destino")));
    }

    public Button guardarBtn(){
        return new Button(By.id("insert"),super.manager);
    }
}
