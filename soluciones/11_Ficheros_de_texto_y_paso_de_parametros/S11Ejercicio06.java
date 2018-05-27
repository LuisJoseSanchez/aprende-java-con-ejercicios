/**
 * 6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 *    fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 *    argumentos en la línea de comandos.
 *
 * @author Luis José Sánchez
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FichEjercicio06 {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Uso del programa: FichEjercicio06 FICHERO PALABRA");
      System.exit(-1);
    }
        
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String palabra = args[1];
      String linea = "";
      int i = 0;
      int repeticiones = 0;
      
      while ((linea = br.readLine()) != null) {
        
        while ((i = linea.indexOf(palabra)) != -1) {
          linea = linea.substring(i + palabra.length(), linea.length());
          repeticiones++;
        }
      }
      
      br.close();
      
      System.out.println("La palabra " + palabra + " aparece " + repeticiones + " veces en el fichero.");

    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
