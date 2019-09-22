import java.util.Scanner;

public class PruebaExcepcionesPropias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la pirámide (un número entre 1 y 10): ");
    int h = Integer.parseInt(s.nextLine());
    
    try {
      pintaPiramide(h);
    } catch (ExcepcionAlturaFueraDeRango eafr) {
      System.out.println("No se ha podido pintar la pirámide.");
    }
  }

  public static void pintaPiramide(int h) throws ExcepcionAlturaFueraDeRango {
    
    if ((h < 1) || (h > 10)) {
      throw new ExcepcionAlturaFueraDeRango();
    }
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = h - 1;
    
    while (planta <= h) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print("*");
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }

  }
}
