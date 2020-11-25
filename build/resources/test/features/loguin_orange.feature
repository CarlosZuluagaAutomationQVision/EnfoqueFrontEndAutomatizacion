#language: es
#author: Jenniffer Escalante

Característica:Logueo con la pagina web OrangeHRM
  Como un usuario
  Quiero ingresar a OrangeHRM
  A verificar mi usuario y clave
  @LogeoOrange
  Esquema del escenario: Logueo de usuario en la pagina OrangeHRM
    Dado que jenni se encuentra en la pagina ORANGE
    Cuando ella ingresa sus datos de usuario prueba
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces ella debería ver las opciones de OrangeHRM

    Ejemplos:
      | usuario | clave    |
      | Admin   | admin123 |

