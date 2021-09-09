package co.com.rappi.certificacion.calculadora.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/perform_multiplication.feature",
        glue = "co.com.rappi.certificacion.calculadora.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class PerformMultiplicationRunner {
}
