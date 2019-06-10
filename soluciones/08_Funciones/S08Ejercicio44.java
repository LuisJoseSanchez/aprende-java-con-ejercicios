import java.util.Scanner;

public class S08Ejercicio44 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    System.out.println(linea('*', altura));
    
    for (int i = 1; i < altura; i++) {
      System.out.print(linea(' ', i));
      System.out.print("*" + linea(' ', altura - i - 2));
      if (i < altura - 1) {
        System.out.println("*");
      }
    }
    System.out.println();
  }

  public static String linea(char caracter, int repeticiones) {

    String resultado = "";

    for (int i = 0; i < repeticiones; i++) {
      resultado += caracter;
    }

    return resultado;
  }
}
