package StepDefs;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\gunth\\Documents\\TestApplication\\TestApp\\src\\test\\resources\\Features\\login.feature", glue={"StepDefs"},dryRun = true,monochrome = true)
public class TestRunner
{

}
