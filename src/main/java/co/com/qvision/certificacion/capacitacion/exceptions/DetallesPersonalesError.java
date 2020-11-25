package co.com.qvision.certificacion.capacitacion.exceptions;

public class DetallesPersonalesError extends AssertionError {

    public static final String EXCEPTION_DATOS_PERSONALES_NO_ALMACENADOS =
        "Los datos personales no fueron almacenados";

    public DetallesPersonalesError(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
