package CucumberOptions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featurefiles",glue="stepDefinations",monochrome=true)
public class TestNGRunner {

}
