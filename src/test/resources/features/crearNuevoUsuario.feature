#language: es

@Historia
Característica: Registrar un nuevo usuario en Utest.com
  Como Mario quiere ingresar a pagina Utest.com y realizar el
  diligenciamiento del formulario para crear un nuevo usuario

  Esquema del escenario: Escenario: Crear un nuevo usuario
    Dado que mario ingresar a la pagina Utest.com
    Cuando damos click en un boton Join Today, diligenciamos el formulario con los datos de usuario y le damos click en el boton Complete Setup
      | <nombre> | <apellido> | <correo> | <mes> | <dia> | <ano> | <contrasena> | <contrasen> |
    Entonces El usuario debera ver en la pantallan Welcome to the world's largest community
      | <validarRegistro> |
    Ejemplos:
      | nombre | apellido | correo                      | mes     | dia | ano  | contrasena | contrasen  | validarRegistro |
      | Jose   | lopez    | joselopez0.123.07@gmail.com | January | 15  | 1900 | Mario.1425 | Mario.1425 | Welcome to the world's largest community of freelance software testers! |
