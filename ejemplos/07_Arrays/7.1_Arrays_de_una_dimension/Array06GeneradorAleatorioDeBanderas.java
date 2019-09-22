import java.util.Scanner;

/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */
public class Array06GeneradorAleatorioDeBanderas {
  public static void main(String[] args) {
    String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
    
    System.out.println("Generador aleatorio de banderas");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Cuántas franjas quiere para la bandera? ");
    int franjas = Integer.parseInt(s.nextLine());
    
    System.out.println("--------------");
    for (int i = 0; i < franjas; i++) {
      System.out.println(color[(int)(Math.random() * 6)]);
      System.out.println("--------------");
    }
  }
}
