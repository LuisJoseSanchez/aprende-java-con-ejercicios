/**
 * Paso de parámetros por valor
 * 
 * @author Luis José Sánchez
 */
public class PruebaParametros1 {
  public static void main(String[] args) {

    int n = 10;

    System.out.println(n);
    calcula(n);
    System.out.println(n);
  }
  
  public static void calcula(int x) {
    x += 24;
    System.out.println(x);
  }
}
