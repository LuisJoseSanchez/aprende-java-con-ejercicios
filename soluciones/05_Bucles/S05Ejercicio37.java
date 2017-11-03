/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 37
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio37 {
  public static void main (String[] args) {
    long num;
    do {
      System.out.print("Introduce un número entero positivo: ");
      num = Integer.parseInt(System.console().readLine());
    } while (num < 1);
    System.out.print(num + " = ");
    
    //comprobar si acababa en cero. Si acaba, se le suma 1
    boolean acabaEnCero = false;
    long aux = num%10;
    if (aux == 0){
      num += 1;
      acabaEnCero = true;
    }
    
    //vuelta
    long vuelta = 0;
    while (num > 0){
      vuelta = vuelta*10 + num%10;
      num /= 10;
    }
 
    aux = vuelta;
    int ultimaCifra; //límite del bucle while
    if (acabaEnCero){
      ultimaCifra = 1;
    } else{
        ultimaCifra = 0;
    }
    
    while (vuelta != ultimaCifra){
      aux = vuelta%10;
      for (int i = 0; i < aux; i++){
        System.out.print("|");
      }
      vuelta /= 10;
      if (vuelta != 0){
        System.out.print("-");
      }
      
    }    
  }
}


