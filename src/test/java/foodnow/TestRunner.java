package foodnow;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/resources/features",
                glue = "foodnow.stepsDefinitions",
                plugin = {"pretty","html:target/cucumber-reports.html"},
                tags = "@InvalidPassword or @Registration or @AddProduct or @Login or @OpenFoodNow"
        )
public class TestRunner {
}
