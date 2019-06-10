import java.util.Scanner;

public class S08Ejercicio41 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    for (int i = altura; i > 0; i--) {
      System.out.println(linea('*', i));
    }
  }

  public static String linea(char caracter, int repeticiones) {

    String resultado = "";

    for (int i = 0; i < repeticiones; i++) {
      resultado += caracter;
    }

    return resultado;
  }
}
