package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by JAY on 2017/2/27.
 */
public class HelloStepdefs {

    private Hello hello;
    private String hi;


    @Given("^I have a greeting application with \"([^\"]*)\"$")
    public void iHaveAGreetingApplicationWith(String arg0) throws Throwable {
        hello = new Hello(arg0);
    }

    @When("^I ask it to say hi$")
    public void iAskItToSayHi() throws Throwable {
        hi = hello.sayHi();
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void iReceive(String arg0) throws Throwable {
        assertEquals(arg0,hi);
    }
}
