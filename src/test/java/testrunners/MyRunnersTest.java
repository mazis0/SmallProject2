package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions", "apphooks"},
        plugin = {"json:target/cucumber.json"}
        //       tags = "@landingpage"

)

public class MyRunnersTest {
}
