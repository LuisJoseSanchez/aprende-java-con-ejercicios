/**
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y
 *    100) en un ArrayList y que luego calcule la suma, la media, el
 *    máximo y el mínimo de esos números. El tamaño de la lista también
 *    será aleatorio y podrá oscilar entre 10 y 20 elementos ambos
 *    inclusive.
 *
 * @author Luis José Sánchez
 */
import java.util.ArrayList;

public class S10Ejercicio02 {
  public static void main(String[] args) {

    int suma = 0;
    int minimo = 100;
    int maximo = 0;
    int tamano = (int)(Math.random() * 11 + 10);

    ArrayList<Integer> a = new ArrayList<Integer>();

    for (int i = 0; i < tamano; i++) {
      a.add((int)(Math.random()*101));
    }

    System.out.println("Lista generada: " + a);

    for(int n : a) {
      suma += n;
      
      if(n < minimo) {
        minimo = n;
      }
      
      if(n > maximo) {
        maximo = n;
      }
     }

    System.out.println("La suma total es : " + suma);
    System.out.println("La media es : " + suma / tamano);
    System.out.println("El mínimo es : " + minimo);
    System.out.println("El máximo es : " + maximo);
  }
}
