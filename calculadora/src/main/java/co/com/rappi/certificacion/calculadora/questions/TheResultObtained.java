package co.com.rappi.certificacion.calculadora.questions;

import static co.com.rappi.certificacion.calculadora.userinterfaces.HomePageComponents.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResultObtained implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_RESULT).viewedBy(actor).asString();
    }

    public static TheResultObtained is(){
        return new TheResultObtained();
    }
}
