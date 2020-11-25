package co.com.qvision.certificacion.capacitacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.qvision.certificacion.capacitacion.userinterfaces.DetallesPersonales.NOMBRE_VALIDACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuNombre implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(NOMBRE_VALIDACION, isVisible()));
        return Text.of(NOMBRE_VALIDACION).viewedBy(actor).asString();
    }

    public static SuNombre guardadoEnPantalla() {
        return new SuNombre();
    }

}
