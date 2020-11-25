package co.com.qvision.certificacion.capacitacion.exceptions;

public class DetallesPersonalesException extends AssertionError {

    public static final String EXCEPTION_DATOS_PERSONALES_NO_ALMACENADOS = "Los datos personales no fueron almacenados";

    public DetallesPersonalesException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
