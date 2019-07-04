import java.util.Scanner;

public class S05Ejercicio68 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    long copia = numeroIntroducido;

    long resultado = 0;
    int cuentaDigitos = 0;
    
    while (numeroIntroducido > 0) {
      int digito = (int) (numeroIntroducido % 10);
      int nuevoDigito = digito % 2 == 1 ? --digito : ++digito;
      resultado = (long) (nuevoDigito * Math.pow(10, cuentaDigitos) + resultado);
      numeroIntroducido /= 10;
      cuentaDigitos++;
    }

    System.out.println("Dislocando el " + copia + " sale el " + resultado);
  }

}
