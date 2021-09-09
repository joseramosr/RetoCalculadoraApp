package co.com.rappi.certificacion.calculadora.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.rappi.certificacion.calculadora.userinterfaces.HomePageComponents.BTN_MINUS;
import static co.com.rappi.certificacion.calculadora.userinterfaces.HomePageComponents.BTN_NUMBER;

public class ValidateIfTheNumber implements Interaction {

    private String number;

    public ValidateIfTheNumber(String number) {
        this.number = number;
    }

    @Override
    @Step("{0} Validate if the number is negative")
    public <T extends Actor> void performAs(T actor) {

        String[] arraySeparateNumber = number.split(" ");
        if (arraySeparateNumber[0].equalsIgnoreCase("-")) {
            actor.attemptsTo(Click.on(BTN_MINUS), Click.on(BTN_NUMBER.of(arraySeparateNumber[1])));
        } else {
            actor.attemptsTo(Click.on(BTN_NUMBER.of(number)));
        }
    }

    public static ValidateIfTheNumber isNegative(String number) {
        return Tasks.instrumented(ValidateIfTheNumber.class, number);
    }
}
