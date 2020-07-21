package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:featureFiles/apiTestRandomUser.feature", glue = {"classpath:stepDefinition","classpath:config"}    )
public class RunJunit {
}
