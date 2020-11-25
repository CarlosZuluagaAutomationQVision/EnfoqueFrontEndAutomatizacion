package co.com.qvision.certificacion.capacitacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/detalles_contacto.feature",
        glue = "co.com.qvision.certificacion.capacitacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerDetallesContacto {
}
