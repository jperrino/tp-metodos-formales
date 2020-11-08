package pageTest;

import io.cucumber.testng.*;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/resources/pageTest",
        glue = "pageTest"
)

public class RunCucumberTest extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
