import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de uso de la clase File
 * Calcula la media de los números que se encuentran en un fichero de texto.
 * El nombre del fichero se pasa como argumento en la línea de comandos.
 *
 * @author Luis José Sánchez
 */
class EjemploFichero09 {
  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Este programa calcula la media de los números contenidos en un fichero.");
      System.out.println("Uso del programa: java EjemploFichero09 FICHERO");
      System.exit(-1); // sale del programa
    }
      
    try {    
      BufferedReader bf = new BufferedReader(new FileReader(args[0]));
      
      String linea = "0";
      int i = 0;
      double suma = 0;
      
      while (linea != null) {
        i++;
        suma += Double.parseDouble(linea);
        linea = bf.readLine();          
      }
      i--;
      
      bf.close();

      System.out.println("La media es " + suma/(double)i);

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
