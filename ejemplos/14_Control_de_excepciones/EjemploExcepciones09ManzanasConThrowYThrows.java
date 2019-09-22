import java.util.Scanner;

public class EjemploExcepciones09ManzanasConThrowYThrows {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Número de manzanas: ");
    int m = Integer.parseInt(s.nextLine());
    System.out.print("Número de personas: ");
    int p = Integer.parseInt(s.nextLine());
    try {
      System.out.print("A cada persona le corresponden " + reparteManzanas(m, p) + " manzanas.");
    } catch (ArithmeticException ae) {
      System.out.println("Los datos introducidos no son correctos.");
    }
  }
  
  public static int reparteManzanas(int manzanas, int personas) throws ArithmeticException {
    try {
      return manzanas / personas;
    } catch (ArithmeticException ae) {
      System.out.println("El número de personas vale 0.");
      throw ae;
    }
  }
}
