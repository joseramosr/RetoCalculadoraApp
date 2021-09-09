package co.com.rappi.certificacion.calculadora.stepdefinitions;

import static co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfSubtractionException.*;

import co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfSubtractionException;
import co.com.rappi.certificacion.calculadora.questions.TheResultObtained;
import co.com.rappi.certificacion.calculadora.tasks.PerformTheSubtraction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PerformSubtractionStepDefinition {

    @When("he performs the subtraction of (.*) minus (.*)")
    public void hePerformsTheSubtractionOfTheNumbers(String number1, String number2) {
        theActorInTheSpotlight().attemptsTo(PerformTheSubtraction.ofTheNumbers(number1, number2));
    }

    @Then("he should see that a number minus zero results in that same number (.*)")
    public void heShouldSeeThatANumberMinusZeroResultsInThatSameNumber(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfSubtractionException.class, INCORRECT_RESULT_OF_SUBTRACTION_WITH_ZERO_MESSAGE_EXCEPTION));
    }

    @Then("he should see that the result of the subtraction is (.*)")
    public void heShouldSeeThatTheResultOfTheSubtractionIs(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfSubtractionException.class, INCORRECT_RESULT_OF_SUBTRACTION_MESSAGE_EXCEPTION));
    }
}