package runCukes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "hooks",
                "step_definitions"
        },
        features = {"classpath:features/"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
        tags = "@01Admin or @02Admin or @03Admin or @04Mentor or @05Mentee"
)

public class RunCukesTest {

}