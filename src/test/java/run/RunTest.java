package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/search.feature",glue="steps",
plugin={"pretty","html:target/reports.html"},tags="@FilterPrice")

public class RunTest extends AbstractTestNGCucumberTests {

}
