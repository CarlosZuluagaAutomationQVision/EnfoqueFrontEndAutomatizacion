package co.com.qvision.certificacion.capacitacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import static co.com.qvision.certificacion.capacitacion.userinterfaces.DetallesPersonales.BTN_MI_INFORMACION;

public class SeleccionarLa implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(CurrentVisibility.of(BTN_MI_INFORMACION).viewedBy(actor).asBoolean()).
                andIfSo(Click.on(BTN_MI_INFORMACION)).
                otherwise());
    }

    public static SeleccionarLa opcionMyInfo() {
        return Tasks.instrumented(SeleccionarLa.class);
    }

}
