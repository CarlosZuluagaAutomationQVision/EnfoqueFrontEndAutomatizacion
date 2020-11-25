package co.com.qvision.certificacion.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DetallesPersonales {


    public static final Target BTN_MI_INFORMACION = Target.the("Boton para ingresar a la opcion My Info").locatedBy("//a[@id='menu_pim_viewMyDetails']//b[contains(text(),'My Info')]");
    public static final Target BTN_EDITAR = Target.the("Boton para editar los campos").located(By.id("btnSave"));
    public static final Target TXT_NOMBRE = Target.the("Campo de texto para ingresar el nombre").located(By.id("personal_txtEmpFirstName"));
    public static final Target TXT_APELLIDO = Target.the("Campo de texto para ingresar el apellido").located(By.id("personal_txtEmpLastName"));
    public static final Target TXT_ID_EMPLEADO = Target.the("Campo de texto para ingresar el número de empleado").located(By.id("personal_txtEmployeeId"));
    public static final Target TXT_NUMERO_LICENCIA = Target.the("Campo de texto para ingresar el número de licencia").located(By.id("personal_txtLicenNo"));
    public static final Target TXT_NUMERO_SSN = Target.the("Campo de texto para ingresar el número de licencia").located(By.id("personal_txtNICNo"));
    public static final Target TXT_FECHA_EXP_LICENCIA = Target.the("Campo para ingresar la fecha de expiración de la licencia").located(By.id("personal_txtLicExpDate"));
    public static final Target RDB_GENERO_M = Target.the("Radio para selecciona el genero masculino").located(By.id("personal_optGender_1"));
    public static final Target RDB_GENERO_F = Target.the("Radio para selecciona el genero femenino").located(By.id("personal_optGender_2"));
    public static final Target LBX_ESTADO_CIVIL = Target.the("Campo para seleccionar el estado cicil").located(By.id("personal_cmbMarital"));
    public static final Target LBX_NACIONALIDAD = Target.the("Campo para seleccionar la nacionalidad").located(By.id("personal_cmbNation"));
    public static final Target TXT_FECHA_NACIMIENTO = Target.the("Campo para ingresar la fecha de nacimiento").located(By.id("personal_DOB"));
    public static final Target TXT_APODO = Target.the("Campo de texto para ingresar el apodo").located(By.id("personal_txtEmpNickName"));
    public static final Target TXT_SERVICIO_MILITAR = Target.the("Campo de texto para ingresar el servicio militar").located(By.id("personal_txtMilitarySer"));
    public static final Target BTN_GUARDAR = Target.the("Boton para guardar los datos").located(By.id("btnSave"));
    public static final Target NOMBRE_VALIDACION = Target.the("Nombre para validar los datos guardados").locatedBy("//div[@id='profile-pic']//h1[contains(text(),'jennifer escalante')]");

}
