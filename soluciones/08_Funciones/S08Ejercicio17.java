/**
 * 8. Funciones
 * 
 * 17. Escribe un programa que pase de binario a decimal.
 * 
 * @author Luis José Sánchez
 */
import matematicas.Varias;

public class S08Ejercicio17 {
  
  public static void main(String[] args) {

    long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(System.console().readLine());
    
    int bits = Varias.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += Varias.digitoN(binario, bits - i - 1) * Varias.potencia(2, i);
    }
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}
