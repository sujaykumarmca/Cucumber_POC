package mytestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class)

@CucumberOptions(features="D:\\sujay workspace\\InfoCucumber\\src\\test\\java\\myfeatures\\mygooglesearch.feature",
				glue = {"mystepdef"},monochrome=true,
				plugin= {"pretty","html:target","json:target/cucumber.json","junit:target/cucumber.xml",
						"rerun:target/failed_scenarios.txt"}
				
				) 

public class mytestrunner {

}
//"rerun:mytestrunner/failed_scenarios.txt"