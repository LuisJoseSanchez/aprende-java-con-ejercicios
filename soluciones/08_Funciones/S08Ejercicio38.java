import static array.Array.generaArrayInt;
import static array.Array.muestraArrayInt;
import static matematicas.Varias.esCapicua;

public class S08Ejercicio38 {

  public static void main(String[] args) {
    int[] numeros = generaArrayInt(20, 1, 1000);

    System.out.println("Array original: ");
    muestraArrayInt(numeros);
    System.out.println("Capicúas: ");
    muestraArrayInt(filtraCapicuas(numeros));
  }

  /**
   * Devuelve un array con todos los números capicúas que se encuentren
   * en otro array.
   * Obviamente el tamaño del array que se devuelve será menor o igual
   * al que se pasa como parámetro.
   * 
   * @param x array con números enteros
   * @return array con los números capicúas extraidos de x
   */
  public static int[] filtraCapicuas(int x[]) {
    int[] capicuas = new int[x.length];
    
    int cuentaCapicuas = 0;
    for (int numero : x) {
      if (esCapicua(numero)) {
        capicuas[cuentaCapicuas++] = numero;
      }
    }
    
    int[] resultado = new int[cuentaCapicuas];
    
    for (int i = 0; i < cuentaCapicuas; i++) {
      resultado[i] = capicuas[i];
    }
   
    return resultado;
  }
  
}
