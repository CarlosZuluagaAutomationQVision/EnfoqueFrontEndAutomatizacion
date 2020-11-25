package co.com.qvision.certificacion.capacitacion.stepdefinitions;

import co.com.qvision.certificacion.capacitacion.exceptions.DetallesPersonalesError;
import co.com.qvision.certificacion.capacitacion.model.DetallesPersonalesModel;
import co.com.qvision.certificacion.capacitacion.questions.SuNombre;
import co.com.qvision.certificacion.capacitacion.tasks.RegistrarLos;
import co.com.qvision.certificacion.capacitacion.tasks.SeleccionarLa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.certificacion.capacitacion.exceptions.DetallesPersonalesError.EXCEPTION_DATOS_PERSONALES_NO_ALMACENADOS;
import static co.com.qvision.certificacion.capacitacion.util.Constantes.NOMBRE_VAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class DetallesPersonalesStepDefinition {

    @Step
    @Cuando("^ella selecciona la opcion my info$")
    public void ellaSeleccionaLaOpcionMyInfo() {
        theActorInTheSpotlight().attemptsTo(SeleccionarLa.opcionMyInfo());
    }


    @Cuando("^ella registra los detalles personales$")
    public void ellaRegistraLosDetallesPersonales(List<DetallesPersonalesModel> agregarDetallesPersonalesModel) {
        theActorInTheSpotlight().attemptsTo(RegistrarLos.misDatosPersonales(agregarDetallesPersonalesModel));
    }

    @Entonces("^ella debería ver sus datos personales guardados en pantalla$")
    public void ellaDeberiaVerSusDatosPersonalesGuardadosEnPantalla() {
        theActorInTheSpotlight().should(seeThat(SuNombre.guardadoEnPantalla(), containsString(NOMBRE_VAL)).orComplainWith(
            DetallesPersonalesError.class, EXCEPTION_DATOS_PERSONALES_NO_ALMACENADOS));
    }

}
