/**
 * Ejemplo de uso de la clase File
 * Listado de los archivos del directorio actual
 *
 * @author Luis José Sánchez
 */

import java.io.File;

class EjemploFichero04 {

  public static void main(String[] args) {

    File fichero = new File(".");  // se indica la ruta entre comillas
                // el punto (.) es el directorio actual

    String[] listaArchivos = fichero.list();
    for(String f : listaArchivos){
      System.out.println(f);
    }  
  }
}
