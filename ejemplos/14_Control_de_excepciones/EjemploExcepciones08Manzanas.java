import java.util.Scanner;

public class EjemploExcepciones08Manzanas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Número de manzanas: ");
    int m = Integer.parseInt(s.nextLine());
    System.out.print("Número de personas: ");
    int p = Integer.parseInt(s.nextLine());
    System.out.print("A cada persona le corresponden " + reparteManzanas(m, p) + " manzanas.");
  }
  
  public static int reparteManzanas(int manzanas, int personas) {
    return manzanas / personas;
  }
}
