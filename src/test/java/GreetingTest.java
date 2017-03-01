import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by JAY on 2017/2/27.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/hello_world.feature",
        glue = {"steps"})
public class GreetingTest {

}
