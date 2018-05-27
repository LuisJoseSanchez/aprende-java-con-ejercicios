/**
 * 4. Sentencia Condicional
 *
 * 9. Realiza un programa que resuelva una ecuación de segundo grado
 *    (del tipo ax2 + bx + c = 0).
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio09 {

  public static void main(String[] args) {
    
    double x1, x2;

    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax^2 + bx + c = 0");
    
    System.out.println("Por favor, introduzca los valores.");
    
    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    
    // 0x^2 + 0x + 0 = 0
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    
    // 0x^2 + 0x + c = 0  con c distinto de 0
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
      
    // ax^2 + bx + 0 = 0  con a y b distintos de 0
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }


    // 0x^2 + bx + c = 0  con b y c distintos de 0
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }

    // ax^2 + bx + c = 0  con a, b y c distintos de 0
    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }

  }
}
