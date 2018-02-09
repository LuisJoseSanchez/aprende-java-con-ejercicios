/**
 * PruebaCubo.java
 * Programa que prueba la clase Cubo
 * @author Luis José Sánchez
 */
public class PruebaCubo {
  public static void main(String[] args) {

    Cubo cubito = new Cubo(2);
    Cubo cubote = new Cubo(7);

    System.out.println("Cubito: \n");
    cubito.pinta();

    System.out.println("\nCubote: \n");
    cubote.pinta();

    System.out.println("\nLleno el cubito: \n");
    cubito.llena();
    cubito.pinta();

    System.out.println("\nEl cubote sigue vacío: \n");
    cubote.pinta();
    
    System.out.println("\nAhora vuelco lo que tiene el cubito en el cubote.\n");
    cubito.vuelcaEn(cubote);

    System.out.println("Cubito: \n");
    cubito.pinta();

    System.out.println("\nCubote: \n");
    cubote.pinta();

    System.out.println("\nAhora vuelco lo que tiene el cubote en el cubito.\n");
    cubote.vuelcaEn(cubito);

    System.out.println("Cubito: \n");
    cubito.pinta();

    System.out.println("\nCubote: \n");
    cubote.pinta();
  }
}
