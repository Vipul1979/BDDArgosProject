package BDDArgosProject;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/ResultPage.feature")
/* @CucumberOptions(features = "src/test/Resources/HomePage.feature",
plugin = {"html:target/cucumber-html-report",
"json:target/cucumber-json-report.json"})*/
//add changes
public class RunCukesTest {
}
