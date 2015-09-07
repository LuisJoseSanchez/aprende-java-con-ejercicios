/**
 * Ejemplos de uso de String
 *
 * @author Luis José Sánchez
 */
public class EjemplosString {
  public static void main(String[] args) {

    System.out.println("\nEjemplo 1");
    System.out.println("En la posición 2 de \"berengena\" está la letra "
                        + "berengena".charAt(2));

    System.out.println("\nEjemplo 2");
    String frase = "Hola caracola.";
    char[] trozo = new char[10];
    trozo[0] = 'z'; trozo[1] = 'z'; trozo[2] = 'z';
    frase.getChars(2, 7, trozo, 1);
    System.out.print("El array de caracteres vale ");
    System.out.println(trozo);
    
    System.out.println("\nEjemplo 3");
    System.out.println("La secuencia \"co\" aparece en la frase en la posición "
                        + frase.indexOf("co"));

    System.out.println("\nEjemplo 4");
    System.out.println("La palabra \"murciélago\" tiene "
                        + "murciélago".length() + " letras");

    System.out.println("\nEjemplo 5");
    String frase2 = frase.replace('o', 'u');
    System.out.println(frase2);

    System.out.println("\nEjemplo 6");
    frase2 = frase.substring(3, 10);
    System.out.println(frase2);

    System.out.println("\nEjemplo 7");
    System.out.println(frase.toLowerCase());

    System.out.println("\nEjemplo 8");
    System.out.println(frase.toUpperCase());
  }
}
