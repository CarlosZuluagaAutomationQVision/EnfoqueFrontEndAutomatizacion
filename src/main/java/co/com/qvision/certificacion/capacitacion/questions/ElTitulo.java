package co.com.qvision.certificacion.capacitacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.qvision.certificacion.capacitacion.userinterfaces.PaginaLogin.LBL_TITULO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElTitulo implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LBL_TITULO, isVisible()));
        return Text.of(LBL_TITULO).viewedBy(actor).asString();
    }

    public static ElTitulo deLaPaginaInicial() {
        return new ElTitulo();
    }
}
