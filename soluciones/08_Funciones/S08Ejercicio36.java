import static array.Array.generaArrayInt;
import static array.Array.muestraArrayInt;
import static matematicas.Varias.esPrimo;

public class S08Ejercicio36 {

  public static void main(String[] args) {
    int[] numeros = generaArrayInt(20, 1, 100);

    System.out.println("Array original: ");
    muestraArrayInt(numeros);
    System.out.println("Primos: ");
    muestraArrayInt(filtraPrimos(numeros));
  }

  /**
   * Devuelve un array con todos los números primos que se encuentren
   * en otro array.
   * Obviamente el tamaño del array que se devuelve será menor o igual
   * al que se pasa como parámetro.
   * 
   * @param x array con números enteros
   * @return array con los números primos extraidos de x
  */
  public static int[] filtraPrimos(int x[]) {
    int[] primos = new int[x.length];
    
    int cuentaPrimos = 0;
    for (int numero : x) {
      if (esPrimo(numero)) {
        primos[cuentaPrimos++] = numero;
      }
    }
    
    int[] resultado = new int[cuentaPrimos];
    
    for (int i = 0; i < cuentaPrimos; i++) {
      resultado[i] = primos[i];
    }
   
    return resultado;
  }
}
