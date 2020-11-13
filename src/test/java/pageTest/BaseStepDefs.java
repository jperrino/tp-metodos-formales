package pageTest;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseStepDefs {
    private String page = "http://localhost/";
    private DriverManager manager;


    public BaseStepDefs(DriverManager manager){
        this.manager = manager;
    }

    @Step("Setup")
    @Before
    public void setup(){
        manager.getDriver().navigate().to(page);
    }

    @Step("Tear Down")
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) manager.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed step"); //stick it in the report
        }
        manager.closeDriver();
    }
}
