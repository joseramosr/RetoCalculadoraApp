package co.com.rappi.certificacion.calculadora.stepdefinitions;

import static co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfMultiplicationException.*;

import co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfMultiplicationException;
import co.com.rappi.certificacion.calculadora.questions.TheResultObtained;
import co.com.rappi.certificacion.calculadora.tasks.PerformTheMultiplication;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PerformMultiplicationStepDefinition {

    @When("he performs the multiplication of (.*) by (.*)")
    public void hePerformsTheMultiplicationOfTheNumbers(String number1, String number2) {
        theActorInTheSpotlight().attemptsTo(PerformTheMultiplication.ofTheNumbers(number1, number2));
    }

    @Then("he should see that a number multiplied by zero results in (.*)")
    public void heShouldSeeThatANumberMultipliedByZeroResultsInZero(String zero) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(zero)).orComplainWith(IncorrectResultOfMultiplicationException.class, INCORRECT_RESULT_OF_MULTIPLICATION_WITH_ZERO_MESSAGE_EXCEPTION));
    }

    @Then("he should see that the result of the multiplication is (.*)")
    public void heShouldSeeThatTheResultOfTheMultiplicationIs(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfMultiplicationException.class, INCORRECT_RESULT_OF_MULTIPLICATION_MESSAGE_EXCEPTION));
    }


}