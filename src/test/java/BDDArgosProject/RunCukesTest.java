package BDDArgosProject;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resources\\HomePage.feature",
        tags = {"@smoke"})

public class RunCukesTest {
}
