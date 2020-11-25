package co.com.qvision.certificacion.capacitacion.tasks;

import static co.com.qvision.certificacion.capacitacion.userinterfaces.PaginaLogin.BTN_LOGIN;
import static co.com.qvision.certificacion.capacitacion.userinterfaces.PaginaLogin.TXT_CLAVE;
import static co.com.qvision.certificacion.capacitacion.userinterfaces.PaginaLogin.TXT_USUARIO;

import co.com.qvision.certificacion.capacitacion.interactions.Esperar;
import co.com.qvision.certificacion.capacitacion.model.DatosInicioSesionModel;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Iniciar implements Task {

  private List<DatosInicioSesionModel> agregarDatosInicioSesionModel;

  public Iniciar(List<DatosInicioSesionModel> agregarDatosInicioSesionModel) {
    this.agregarDatosInicioSesionModel = agregarDatosInicioSesionModel;
  }

  @Step("{0} inicio sesion")
  @Override
  public <T extends Actor> void performAs(T actor) {
    DatosInicioSesionModel infoInicioSesion = agregarDatosInicioSesionModel.get(0);
    actor.attemptsTo(Enter.theValue(infoInicioSesion.getUsuario()).into(TXT_USUARIO),
        Enter.theValue(infoInicioSesion.getClave()).into(TXT_CLAVE),
        Esperar.unMomento(2),
        Click.on(BTN_LOGIN),
        Esperar.unMomento(5));
  }

  public static Iniciar sesion(List<DatosInicioSesionModel> agregarDatosInicioSesionModel) {
    return Tasks.instrumented(Iniciar.class, agregarDatosInicioSesionModel);
  }
}
