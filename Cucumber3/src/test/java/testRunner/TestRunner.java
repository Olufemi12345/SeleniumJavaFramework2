package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"FEATURE"},
		glue= {"steps"},
		plugin= {"pretty","html:Report1"},
	    dryRun=true,
		monochrome=true,
	    tags= {"@45"},
		strict=true
		)
public class TestRunner {

}
