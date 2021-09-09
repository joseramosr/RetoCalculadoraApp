package co.com.rappi.certificacion.calculadora.interactions;
import static co.com.rappi.certificacion.calculadora.userinterfaces.HomePageComponents.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ValidateThat implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_DEL,isEnabled()).forNoMoreThan(10).seconds(),
                Ensure.that(BTN_DEL).isDisplayed());
    }

    public static Performable theCalculatorWasOpen() {
        return instrumented(ValidateThat.class);
    }
}
