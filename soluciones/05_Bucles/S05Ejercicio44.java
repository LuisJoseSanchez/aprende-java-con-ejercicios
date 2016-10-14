/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 44
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio44 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca la posición donde quiere insertar: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca el dígito que quiere insertar: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda con el dígito pegado
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    // resultado
    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion + 1)) + parteDerecha;
    System.out.print("El número resultante es " + numero);
  }
}
