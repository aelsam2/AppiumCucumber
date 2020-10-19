package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/SurfboardRegistration.feature", glue= {"StepDefinition"},
monochrome=false,
plugin= {"pretty","html:target/htmlReport","json:target/cucumber.json"},
dryRun=false
)
public class testRunner {

}
