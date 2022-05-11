/**
 * 8. Funciones
 * 
 * 18. Escribe un programa que pase de decimal a binario.
 * 
 * @author Luis José Sánchez
 */
import matematicas.Varias;

public class S08Ejercicio18 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
    int decimal = Integer.parseInt(System.console().readLine());
    
    System.out.println(decimal + " en decimal es " + decimalABinario(decimal)
        + " en binario.");
    
  } // main
  
  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número entero en base 10
   * @return        número inicial pasado a binario
   */
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = Varias.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = Varias.pegaPorDetras(binario, 1);
    binario = Varias.voltea(binario);
    binario = Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
}
