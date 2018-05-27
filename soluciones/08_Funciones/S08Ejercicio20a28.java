/**
 * 
 * 8. Funciones
 * 
 * Ejercicios 20-28
 * 
 * @author Luis José Sánchez
 * 
 */
 
import array.Array;

public class S08Ejercicio20a28 {

  public static void main(String[] args) {
    
    int[] a = array.Array.generaArrayInt(20, 0, 100);
    
    array.Array.muestraArrayInt(a);
    System.out.println("Mínimo: " + array.Array.minimoArrayInt(a));
    System.out.println("Máximo: " + array.Array.maximoArrayInt(a));
    System.out.println("Media: " + array.Array.mediaArrayInt(a));
    
    if (array.Array.estaEnArrayInt(a, 24)) {
      System.out.println("El 24 está en el array.");
    } else {
      System.out.println("El 24 no está en el array.");
    }
      
    System.out.println("El 24 está en la posición " + array.Array.posicionEnArrayInt(a, 24));
    
    System.out.print("Array al revés: ");
    array.Array.muestraArrayInt(array.Array.volteaArrayInt(a));
    
    System.out.print("Array rotado 3 pasos a la derecha: ");
    array.Array.muestraArrayInt(array.Array.rotaDerechaArrayInt(a, 3));
    
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    array.Array.muestraArrayInt(array.Array.rotaIzquierdaArrayInt(a, 4));
  }
}
