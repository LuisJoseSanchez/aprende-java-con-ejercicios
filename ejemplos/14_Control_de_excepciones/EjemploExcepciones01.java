import java.util.Scanner;

class EjemploExcepciones01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa calcula la media de dos números");
    
    System.out.print("Introduzca el primer número: ");
    double numero1 = Double.parseDouble(s.nextLine());
    
    System.out.print("Introduzca el segundo número: ");
    double numero2 = Double.parseDouble(s.nextLine());
    
    System.out.println("La media es " + (numero1 + numero2) / 2);
  }
}
