package co.com.qvision.certificacion.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin {

    public static final Target TXT_USUARIO = Target.the("Campo de texto para ingresar el usuario").located(By.id("txtUsername"));
    public static final Target TXT_CLAVE = Target.the("Campo de texto para ingresar la clave").located(By.id("txtPassword"));
    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion").located(By.id("btnLogin"));
    public static final Target LBL_TITULO = Target.the("Boton para iniciar sesion").locatedBy("//h1[contains(text(),'Dashboard')]");

}
