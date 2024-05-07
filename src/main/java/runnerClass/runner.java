package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdef.baseClass;

@CucumberOptions(features = "src/main/java/feature", 
                 glue = "stepdef", monochrome = true, publish = true)
public class runner extends baseClass {

}
