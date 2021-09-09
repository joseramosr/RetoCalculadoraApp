package co.com.rappi.certificacion.calculadora.tasks;

import co.com.rappi.certificacion.calculadora.interactions.ValidateIfTheNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.rappi.certificacion.calculadora.userinterfaces.HomePageComponents.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PerformTheSum implements Task {

    private String number1;
    private String number2;

    public PerformTheSum(String number1, String number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ValidateIfTheNumber.isNegative(number1),
                Click.on(BTN_PLUS),
                Click.on(BTN_NUMBER.of(number2)), Click.on(BTN_EQUALS));
    }

    public static Performable ofTheNumbers(String number1, String number2) {
        return instrumented(PerformTheSum.class, number1, number2);
    }
}
