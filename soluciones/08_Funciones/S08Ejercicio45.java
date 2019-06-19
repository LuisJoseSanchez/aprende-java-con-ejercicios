import java.util.Scanner;

public class S08Ejercicio45 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

   
    for (int i = 1; i < altura; i++) {
      System.out.print(linea('*', i));
      System.out.print(linea(' ', altura * 2 - i * 2 - 1));
      System.out.println(linea('*', i));
    }

    System.out.println(linea('*', altura * 2 - 1));
    
  }

  public static String linea(char caracter, int repeticiones) {

    String resultado = "";

    for (int i = 0; i < repeticiones; i++) {
      resultado += caracter;
    }

    return resultado;
  }

}
