package com.xiniu.futurehis.cucumbertest.calculator;

import com.xiniu.futurehis.cucumbertest.action.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * @Author wb-tjw362524
 * @Description
 * @Date 11:04 2018/2/5
 */
public class AddStepDefs {
    Calculator calculator = new Calculator();

    @When("^the calculator is run$")
    public void theCalculatorIsRun() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator.calculate();
    }

    @Given("^i input \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iInputAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator.setNum1(Integer.parseInt(arg0));
        calculator.setNum2(Integer.parseInt(arg1));
    }

    @Then("^the output should be \"([^\"]*)\"$")
    public void theOutputShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Integer.parseInt(arg0),calculator.getTotal());
    }
}
