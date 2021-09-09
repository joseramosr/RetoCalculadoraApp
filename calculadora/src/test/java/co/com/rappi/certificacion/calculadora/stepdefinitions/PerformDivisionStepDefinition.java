package co.com.rappi.certificacion.calculadora.stepdefinitions;

import static co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfDivisionException.*;

import co.com.rappi.certificacion.calculadora.exceptions.IncorrectResultOfDivisionException;
import co.com.rappi.certificacion.calculadora.questions.TheResultObtained;
import co.com.rappi.certificacion.calculadora.tasks.PerformTheDivision;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PerformDivisionStepDefinition {

    @When("he performs the division of (.*) by (.*)")
    public void hePerformsTheDivisionOfTheNumbers(String number1, String number2) {
        theActorInTheSpotlight().attemptsTo(PerformTheDivision.ofTheNumbers(number1, number2));
    }

    @Then("he should see that the result of division by zero is (.*)")
    public void heShouldSeeThatTheResultOfDivisionByZeroIs(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfDivisionException.class, INCORRECT_RESULT_OF_DIVISION_WITH_ZERO_MESSAGE_EXCEPTION));
    }

    @Then("he should see that the result of the division is (.*)")
    public void heShouldSeeThatTheResultOfTheDivisionIs(String theExpectedResult) {
        theActorInTheSpotlight().should(seeThat(TheResultObtained.is(), equalTo(theExpectedResult)).orComplainWith(IncorrectResultOfDivisionException.class, INCORRECT_RESULT_OF_DIVISION_MESSAGE_EXCEPTION));
    }

}