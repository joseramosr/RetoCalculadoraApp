package co.com.rappi.certificacion.calculadora.stepdefinitions;

import co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfSumException;
import co.com.rappi.certificacion.calculadora.questions.TheResultObtained;
import co.com.rappi.certificacion.calculadora.tasks.PerformTheSum;
import co.com.rappi.certificacion.calculadora.interactions.ValidateThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.*;

import static co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfSumException.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PerformSumStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the (.*) opens the calculator app")
    public void thatTheAnalystOpensTheCalculatorApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(ValidateThat.theCalculatorWasOpen());
    }

    @When("he performs the sum of (.*) plus (.*)")
    public void hePerformsTheSumOfTheNumbers(String number1, String number2) {
        theActorInTheSpotlight().attemptsTo(PerformTheSum.ofTheNumbers(number1, number2));
    }

    @Then("he should see that a number plus zero results in that same number (.*)")
    public void heShouldSeeThatANumberPlusZeroResultsInThatSameNumber(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfSumException.class, INCORRECT_RESULT_OF_SUM_WITH_ZERO_MESSAGE_EXCEPTION));
    }

    @Then("he should see that the result of the sum is (.*)")
    public void heShouldSeeThatTheResultOfTheSumIs(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfSumException.class, INCORRECT_RESULT_OF_SUM_MESSAGE_EXCEPTION));
    }


}