package co.com.qvision.certificacion.capacitacion.tasks;

import co.com.qvision.certificacion.capacitacion.interactions.Esperar;
import co.com.qvision.certificacion.capacitacion.model.DetallesPersonalesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import java.util.List;

import static co.com.qvision.certificacion.capacitacion.userinterfaces.DetallesPersonales.*;
import static co.com.qvision.certificacion.capacitacion.util.Constantes.GENERO;

public class RegistrarLos implements Task {
    private List<DetallesPersonalesModel> agregarDetallesPersonalesModel;

    public RegistrarLos(List<DetallesPersonalesModel> agregarDetallesPersonalesModel) {
        this.agregarDetallesPersonalesModel = agregarDetallesPersonalesModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DetallesPersonalesModel infoDatosPersonales = agregarDetallesPersonalesModel.get(0);

        actor.attemptsTo(Check.whether(CurrentVisibility.of(BTN_EDITAR).viewedBy(actor).asBoolean()).
                andIfSo(Click.on(BTN_EDITAR)).otherwise());
        actor.attemptsTo(
                Enter.theValue(infoDatosPersonales.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(infoDatosPersonales.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(infoDatosPersonales.getIdEmpleado()).into(TXT_ID_EMPLEADO),
                Enter.theValue(infoDatosPersonales.getNumeroLicencia()).into(TXT_NUMERO_LICENCIA),
                Enter.theValue(infoDatosPersonales.getFechaExpiracionLicencia()).into(TXT_FECHA_EXP_LICENCIA),
                Enter.theValue(infoDatosPersonales.getSsnNumero()).into(TXT_NUMERO_SSN),
                Check.whether(infoDatosPersonales.getGenero().equals(GENERO)).
                        andIfSo(Click.on(RDB_GENERO_F)).otherwise(Click.on(RDB_GENERO_M)),
                SelectFromOptions.byVisibleText(infoDatosPersonales.getEstadoCivil()).from(LBX_ESTADO_CIVIL),
                SelectFromOptions.byVisibleText(infoDatosPersonales.getNacionalidad()).from(LBX_NACIONALIDAD),
                Enter.theValue(infoDatosPersonales.getFechaNacimiento()).into(TXT_FECHA_NACIMIENTO),
                Enter.theValue(infoDatosPersonales.getApodo()).into(TXT_APODO),
                Enter.theValue(infoDatosPersonales.getServicioMilitar()).into(TXT_SERVICIO_MILITAR),
                Click.on(BTN_GUARDAR),
                Esperar.unMomento(4));
    }

    public static RegistrarLos misDatosPersonales(List<DetallesPersonalesModel> agregarDetallesPersonalesModel) {
        return Tasks.instrumented(RegistrarLos.class, agregarDetallesPersonalesModel);
    }
}
