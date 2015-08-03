/**
 * 4. Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 *    contenidas en un fichero de texto. El nombre del fichero que contiene las
 *    palabras se debe pasar como argumento en la línea de comandos. El nombre
 *    del fichero resultado debe ser el mismo que el original añadiendo la
 *    coletilla <code>sort</code>, por ejemplo <code>palabras_sort.txt</code>.
 *    Suponemos que cada palabra ocupa una línea.
 *
 * @author Luis José Sánchez
 */
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

class S11Ejercicio04 {
  public static void main(String[] args) {
    
    if (args.length != 1) {
      System.out.println("Uso del programa: S11Ejercicio04 FICHERO.TXT");
      System.exit(-1);
    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      int l = args[0].length();
      String nombre = args[0].substring(0, l - 4);
      String extension = args[0].substring(l - 4, l);

      BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));

      Vector<String> v = new Vector<String>();

      String linea = "";
      while (linea != null) {
        v.addElement(linea);
        linea = br.readLine();
      }
      br.close();

      v.removeElementAt(0);
      Collections.sort(v);
      
      for (String s: v) {
        bw.write(s + "\n");
      }

      bw.close();
    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
