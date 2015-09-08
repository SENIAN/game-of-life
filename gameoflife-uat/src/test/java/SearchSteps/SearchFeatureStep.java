package SearchSteps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Mohammed on 7-9-2015.
 */


@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/Resources/",

        plugin = {"pretty", "html:target/cucumber-html-report"},

        tags = {"@Runme"})

public class SearchFeatureStep {

}
