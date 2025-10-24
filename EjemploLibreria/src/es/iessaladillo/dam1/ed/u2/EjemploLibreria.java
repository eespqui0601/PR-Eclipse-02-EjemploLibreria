package es.iessaladillo.dam1.ed.u2;

import org.joda.time.LocalDate;   // importamos clase de la librería externa

public class EjemploLibreria {
    public static void main(String[] args) {
        LocalDate hoy = new LocalDate();        // Fecha actual
        LocalDate futuro = hoy.plusDays(10);    // Fecha dentro de 10 días

        //Escribe tú las dos próximas líneas de código:
        //Muestra el mensaje en consola "Hoy es: XXX", donde XXX es el valor de la variable hoy.
        //Muestra el mensaje en consola "Dentro de 10 días será: XXX", donde XXX es el valor de la variable futuro.
    }
}

//¿Qué pasaría si exporto el proyecto a un .zip y se lo paso a un amigo o me lo llevo al ordenador de casa? ¿Funcionaría? Razona la respuesta.
//Si, debería de funcionar, ya que se puede importar como un proyecto de java en el ottro ordenador directamente desde el archivo zip y en el proyecto se incluye la librería necesarria para que funcione.

//¿Qué pasaría si eliminas el archivo .jar de la carpeta lib?¿Qué ha pasado y por qué?
//No ecnontraría la librería a la hora de ejecutar el código ya que la hemos eliminado del proyecto.

//¿Observas alguna diferencia en la configuración del Build Path? ¿Crees que si lo exporto a .zip y se lo paso a un compañero le funcionaría?