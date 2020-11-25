package co.com.qvision.certificacion.capacitacion.stepdefinitions;

import static co.com.qvision.certificacion.capacitacion.exceptions.InicioDeSesionError.EXCEPTION_USUARIO_Y_CLAVE_INVALIDO;
import static co.com.qvision.certificacion.capacitacion.util.Constantes.TITULO_INICIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.qvision.certificacion.capacitacion.exceptions.InicioDeSesionError;
import co.com.qvision.certificacion.capacitacion.model.DatosInicioSesionModel;
import co.com.qvision.certificacion.capacitacion.questions.ElTitulo;
import co.com.qvision.certificacion.capacitacion.tasks.AbrirElNavegador;
import co.com.qvision.certificacion.capacitacion.tasks.Iniciar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InicioSesionStepDefinition {

  @Before
  public void inicio() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) se encuentra en la pagina ORANGE$")
  public void queJenniSeEncuentraEnLaPaginaOrange(String nombreActor) {
    theActorCalled(nombreActor).wasAbleTo(AbrirElNavegador.enLaPaginaDeOrange());
  }

  @Cuando("^ella ingresa sus datos de usuario prueba$")
  public void ellaIngresaSusDatosDeUsuarioPrueba(
      List<DatosInicioSesionModel> agregarDatosInicioSesionModel) {
    theActorInTheSpotlight().attemptsTo(Iniciar.sesion(agregarDatosInicioSesionModel));
  }

  @Entonces("^ella debería ver las opciones de OrangeHRM$")
  public void ellaDeberiaVerLasOpcionesDeOrangeHrm() {
    theActorInTheSpotlight()
        .should(seeThat(ElTitulo.deLaPaginaInicial(), containsString(TITULO_INICIO)).orComplainWith(
            InicioDeSesionError.class, EXCEPTION_USUARIO_Y_CLAVE_INVALIDO));
  }

}
