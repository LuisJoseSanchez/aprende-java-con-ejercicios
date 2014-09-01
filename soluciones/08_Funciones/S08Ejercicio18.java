/**
 * 
 * 8. Funciones
 * 
 * 18. Escribe un programa que pase de decimal a binario.
 * 
 * @author Luis José Sánchez
 * 
 */
 
import matematicas.*;

public class S08Ejercicio18 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    int decimal = Integer.parseInt(System.console().readLine());
    
    System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");
    
  } // main
    
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = matematicas.Varias.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
}
