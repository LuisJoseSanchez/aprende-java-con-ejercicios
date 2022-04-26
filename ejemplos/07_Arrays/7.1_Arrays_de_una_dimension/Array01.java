/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */
public class Array01 {
  public static void main(String[] args) {
        
    int[] n; // define n como un array de enteros
    n = new int[4]; // reserva espacio para 4 enteros
            
    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;
    
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
    
    int suma = n[0] + n[3];
    System.out.println("\nEl primer elemento del array más el último suman " + suma);
  }
}
