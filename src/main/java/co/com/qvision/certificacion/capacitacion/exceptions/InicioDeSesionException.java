package co.com.qvision.certificacion.capacitacion.exceptions;

public class InicioDeSesionException extends AssertionError {

    public static final String EXCEPTION_USUARIO_Y_CLAVE_INVALIDO = "El usuario y/o clave son inválidos";

    public InicioDeSesionException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
