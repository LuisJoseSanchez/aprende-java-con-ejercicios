/**
 * 3. Escribe un programa que ordene 10 números enteros introducidos por
 *    teclado y almacenados en un objeto de la clase ArrayList .
 *
 * @author Luis José Sánchez
 */
import java.util.ArrayList;
import java.util.Collections;

public class S10Ejercicio03 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    System.out.println("Introduzca 10 números enteros: ");
    
    for (int i = 0; i < 10; i++) {
      a.add(Integer.parseInt(System.console().readLine()));
    }

    System.out.println("Lista original: " + a);

    Collections.sort(a);

    System.out.println("Lista ordenada de menor a mayor: " + a);

    // Descomenta el siguiente bloque para ordenar la lista de mayor a
    // menor
    /*
      ArrayList<Integer> b = new ArrayList<Integer>();

      for(int n : a) {
        b.add(0, n);
      }
        
      System.out.print("Lista ordenada de mayor a menor: " + b);
    */
  }
}
