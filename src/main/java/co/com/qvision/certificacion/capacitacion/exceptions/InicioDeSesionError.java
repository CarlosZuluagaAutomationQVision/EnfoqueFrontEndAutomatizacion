package co.com.qvision.certificacion.capacitacion.exceptions;

public class InicioDeSesionError extends AssertionError {

    public static final String EXCEPTION_USUARIO_Y_CLAVE_INVALIDO = "El usuario y/o clave son inválidos";

    public InicioDeSesionError(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
