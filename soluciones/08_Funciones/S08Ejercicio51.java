import array.Array;
import matematicas.Varias;

public class S08Ejercicio51 {

  public static void main(String[] args) {
    final int[] a = Array.generaArrayInt(10, 2, 100);
    
    System.out.println("Array generado:");
    Array.muestraArrayInt(a);
    
    System.out.println();
    
    for (int n : a) {
      if (Varias.esPrimo(n)) {
        System.out.print("El " + n + " es primo");
      } else {
        System.out.print("El " + n + " no es primo");
      }
      
      if (Varias.esCapicua(n)) {
        System.out.println(" y es capicúa.");
      } else {
        System.out.println(" y no es capicúa.");
      }
    }
  }
  
}
