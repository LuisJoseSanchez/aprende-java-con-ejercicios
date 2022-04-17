import java.util.Scanner;

public class S05Ejercicio52 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long copia = numeroIntroducido;
    int longitud = 0;
    
    while (copia > 0) {
      copia /= 10;
      longitud++;
    }
    
    int primero =  (int)(numeroIntroducido / Math.pow(10, longitud - 1));
    long aux = (long)(primero * Math.pow(10, longitud - 1));
    long resultado = (numeroIntroducido - aux) * 10 + primero;
    System.out.println("El número resultado es " + resultado + ".");
  }
  
}
