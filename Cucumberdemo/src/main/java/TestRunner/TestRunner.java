package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C://Users//pgurumallaiah//Cucumber//Cucumberdemo//src//main//java//Features//OrangeHRM_background.feature",
//		features="@target/rerun.txt",
		glue = "StepDefinitions",
		dryRun=false,
//		tags= "@sanity",
		plugin={"pretty","html:test-output","json:json_output","rerun:target//rerun.txt"}
		
		
		)

public class TestRunner {

	

}
