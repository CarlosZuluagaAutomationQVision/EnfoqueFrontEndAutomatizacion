package co.com.qvision.certificacion.capacitacion.tasks;

import co.com.qvision.certificacion.capacitacion.interactions.Esperar;
import co.com.qvision.certificacion.capacitacion.model.DatosInicioSesionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.qvision.certificacion.capacitacion.userinterfaces.PaginaLogin.*;

public class Iniciar implements Task {
    private List<DatosInicioSesionModel> AgregarDatosInicioSesionModel;

    public Iniciar(List<DatosInicioSesionModel> AgregarDatosInicioSesionModel) {
        this.AgregarDatosInicioSesionModel = AgregarDatosInicioSesionModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosInicioSesionModel infoInicioSesion = AgregarDatosInicioSesionModel.get(0);
        actor.attemptsTo(Enter.theValue(infoInicioSesion.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(infoInicioSesion.getClave()).into(TXT_CLAVE),
                Esperar.unMomento(2),
                Click.on(BTN_LOGIN),
                Esperar.unMomento(5));
    }

    public static Iniciar sesion(List<DatosInicioSesionModel> AgregarDatosInicioSesionModel) {
        return Tasks.instrumented(Iniciar.class, AgregarDatosInicioSesionModel);
    }
}
