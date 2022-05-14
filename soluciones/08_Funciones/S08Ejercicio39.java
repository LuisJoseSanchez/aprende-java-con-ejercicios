import static matematicas.Varias.digitoN;
import static matematicas.Varias.digitos;

public class S08Ejercicio39 {

  public static void main(String[] args) {
    final int[] numeros = {470213, 2130, 9, 1124, 86};

    for (int numero : numeros) {
      System.out.println(numero);
      System.out.println(convierteEnPalabras(numero) + "\n");
    }
  }

  public static String convierteEnPalabras(int n) {
    final String[] digitos = {
      "cero", "uno", "dos", "tres", "cuatro",
      "cinco", "seis", "siete", "ocho", "nueve"
    };

    String resultado = "";

    int i;
    for (i = 0; i < digitos(n) - 1; i++) {
      resultado += digitos[digitoN(n, i)] + ", ";
    }
    resultado += digitos[digitoN(n, i)];

    return resultado;
  }

}
