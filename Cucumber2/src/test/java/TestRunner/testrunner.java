package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
  features= {"features"},
  glue= {"steps"},
 // plugin= {"pretty","html:Report1"},
  //dryRun=true,
   tags= {"@p1"}
		
		)

public class testrunner {

}
