package co.com.qvision.certificacion.capacitacion.tasks;

import co.com.qvision.certificacion.capacitacion.userinterfaces.PaginaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.qvision.certificacion.capacitacion.util.Constantes.URL_BASE;

public class AbrirElNavegador implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL_BASE));
    }

    public static AbrirElNavegador enLaPaginaDeOrange() {
        return Tasks.instrumented(AbrirElNavegador.class);
    }
}
