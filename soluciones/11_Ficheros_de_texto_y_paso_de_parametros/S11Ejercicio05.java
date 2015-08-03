/**
 * 5. Escribe un programa capaz de quitar los comentarios de un programa de
 *    Java. Se utilizaría de la siguiente manera:
 *    <p>
 *    <code>quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO</code>
 *    <p>
 *    Por ejemplo:
 *    <p>
 *    <code>quita_comentarios hola.java holav2.java</code>
 *    <p>
 *    crea un fichero con nombre <code>holav2.java</code> que contiene el código
 *    de <code>hola.java</code> pero sin los comentarios.
 *
 * @author Luis José Sánchez
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FichEjercicio05 {
  public static void main(String[] args) {
    
    if (args.length != 2) {
      System.out.println("Uso del programa: S11Ejercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
      System.exit(-1);
    }
        
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

      String lineaOrigen = "";
      String lineaDestino = "";
      boolean comentarioDeBloque = false;
      int i = 0;
      
      while ((lineaOrigen = br.readLine()) != null) {
        
        int l = lineaOrigen.length();
        lineaDestino = lineaOrigen;

        // Detecta inicio de comentario de bloque 
        if ((i = lineaOrigen.indexOf("/*")) != -1) {
          comentarioDeBloque = true;
          lineaDestino = lineaOrigen.substring(0, i);
          lineaOrigen = lineaDestino;
        }
        
        // Detecta fin de comentario de bloque 
        if ((i = lineaOrigen.indexOf("*/")) != -1) {
          comentarioDeBloque = false;
          lineaDestino = lineaOrigen.substring(i + 2, l);
        }
        // Detecta comentario de línea
        if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque) {
          lineaDestino = lineaOrigen.substring(0, i);
        }

        if (!comentarioDeBloque) {
          bw.write(lineaDestino + "\n");
        }
      }
      
      br.close();
      bw.close();

    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
