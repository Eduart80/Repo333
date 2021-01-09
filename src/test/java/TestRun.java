import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path to feature file
        features = {"src/test/resources/feature"},

        //Specific the step definition package
        glue = {"StepDefinition","DriverWrapper"},

        //Specific tag to get executed
        tags = {"@smoke"}, //@smoke @sanity @regression

        //readable console logs
        monochrome = true,

        //create cucumber report
        plugin = {"pretty", "html:Reports/Default/"},

        //this create auto method in camelCase
        snippets = SnippetType.CAMELCASE

)


public class TestRun {}
