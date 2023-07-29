package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources", // Chemin vers les fonctionnalités (features)
    glue = "stepDefinitions" // Chemin vers les définitions de pas (step definitions)
)
public class testRunner {

}
