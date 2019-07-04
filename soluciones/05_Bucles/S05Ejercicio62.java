import java.util.Scanner;

public class S05Ejercicio62 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    long copia = numeroIntroducido;
    
    int afortunados = 0;
    int noAfortunados = 0;
    
    while (numeroIntroducido > 0) {
	  int digito = (int)(numeroIntroducido % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afortunados++;
      } else {
		noAfortunados++;
	  }
	  numeroIntroducido /= 10;
    }

    if (afortunados > noAfortunados) {
      System.out.println("El " + copia + " es un número afortunado.");
    } else {
      System.out.println("El " + copia + " no es un número afortunado.");
    }
    
  }
  
}
