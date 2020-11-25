#language: es
#author: Jenniffer Escalante

Característica:Registrar los detalles de contacto en la pagina web OrangeHRM
  Como un usuario
  Quiero ingresar a OrangeHRM
  A personalizar mis datos de contacto

  @DetallesPersonales
  Esquema del escenario: Registro de detalles personales en la opcion My Info
    Dado que jenni se encuentra en la pagina ORANGE
    Cuando ella ingresa sus datos de usuario prueba
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y ella selecciona la opcion my info
    Y ella registra los detalles personales
      | nombre   | apellido   | idEmpleado   | numeroLicencia   | fechaExpiracionLicencia   | ssnNumero   | genero   | estadoCivil   | nacionalidad   | fechaNacimiento   | apodo   | servicioMilitar   |
      | <nombre> | <apellido> | <idEmpleado> | <numeroLicencia> | <fechaExpiracionLicencia> | <ssnNumero> | <genero> | <estadoCivil> | <nacionalidad> | <fechaNacimiento> | <apodo> | <servicioMilitar> |

    Entonces ella debería ver sus datos personales guardados en pantalla

    Ejemplos:
      | usuario              | clave                 | nombre   | apellido  | idEmpleado     | numeroLicencia | fechaExpiracionLicencia | ssnNumero | genero          | estadoCivil  | nacionalidad | fechaNacimiento | apodo      | servicioMilitar |
      | Admin                | admin123              | jennifer | escalante | 384674         | 83923983       | 2020-12-31              | 345455656 | F               | Married      | Colombian    | 1988-01-02      | jescalante | No              |


