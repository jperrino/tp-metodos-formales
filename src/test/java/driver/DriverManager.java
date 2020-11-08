package driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.PropertyReader;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    WebDriver driver;
    JavascriptExecutor js;

    private WebDriver createDriver() {
        String driverPath = PropertyReader.getProperty("driver.bin.directory");
        if(driverPath != null) {
            System.setProperty("webdriver.chrome.driver", driverPath);
        }
        ChromeOptions crOptions = new ChromeOptions();
        crOptions.addArguments("disable-infobars");
        return new ChromeDriver(crOptions);
    }

    public WebDriver getDriver() {
        if(driver == null) {
            synchronized (DriverManager.class) {
                driver = createDriver();
                driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
            }
        }
        return driver;
    }

    public JavascriptExecutor getJsExecutor() {
        if(js == null) {
            return (JavascriptExecutor) driver;
        }
        else return js;
    }

    public void wait(int seconds) {
        try {
            synchronized (this.getDriver()) {
                this.getDriver().wait(seconds * 1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Driver interrupted exception");
            e.printStackTrace();
        }
    }

    public void closeDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

