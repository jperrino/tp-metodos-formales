package pageObjects;

import controls.Button;
import driver.DriverManager;
import org.openqa.selenium.By;

public class NavBar extends BasePage {
    public NavBar(DriverManager manager) {
        super(By.xpath(""), manager);
    }

    public Button tallerBtn() {
        return new Button(By.xpath("//a[text()='Taller']"), super.manager);
    }

    public Button tallerDropdownBtn() {
        return new Button(By.xpath("//a[@id='navbarDropdownTaller']"), super.manager);
    }

    public Button altaUnidadesBtn() {
        return new Button(By.xpath("//a[text()='Alta Unidades']"), super.manager);
    }

    public Button altaReparacionesBtn() {
        return new Button(By.xpath("//a[text()='Alta Reparaciones']"), super.manager);
    }

    public Button listadoServiciosBtn() {
        return new Button(By.xpath("//a[text()='Listado de Servicios']"), super.manager);
    }

    public Button listadoServiciosDropdownBtn() {
        return new Button(By.xpath("//a[@id='navbarDropdownListadoServicios']"), super.manager);
    }

    public Button altaServiciosBtn() {
        return new Button(By.xpath("//a[text()='Alta Servicios']"), super.manager);
    }

    public Button calendarioViajesBtn() {
        return new Button(By.xpath("//a[text()='Calendario de Viajes']"), super.manager);
    }

    public Button calendarioViajesDropdownBtn() {
        return new Button(By.xpath("//a[@id='navbarDropdownCalendarioViajes']"), super.manager);
    }

    public Button altaViajesBtn() {
        return new Button(By.xpath("//a[text()='Alta Viajes']"), super.manager);
    }

    public Button estacionesBtn() {
        return new Button(By.xpath("//a[text()='Estaciones']"), super.manager);
    }

    public Button estacionesDropdownBtn() {
        return new Button(By.xpath("//a[@id='navbarDropdownEstaciones']"), super.manager);
    }

    public Button altaEstacionBtn() {
        return new Button(By.xpath("//a[text()='Alta Estacion']"), super.manager);
    }


}
