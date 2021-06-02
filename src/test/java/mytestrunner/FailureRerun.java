package mytestrunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"@target/failed_scenarios.txt"}, 
        monochrome = true, 
        plugin = {
        "pretty", "html:target/cucumber-report/single",
        "json:target/cucumber-report/single/rerun_cucumber.json","rerun:target/failed_scenarios.txt"},
        glue = {"mystepdef"}
        )

public class FailureRerun 
{
	

}
