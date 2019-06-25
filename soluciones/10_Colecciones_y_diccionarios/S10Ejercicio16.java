import java.util.HashMap;
import java.util.Scanner;

public class S10Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    HashMap<String, String> capitales = new HashMap<>();

    capitales.put("España", "Madrid");
    capitales.put("Portugal", "Lisboa");
    capitales.put("Francia", "París");

    String cadenaIntroducida = "";

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      cadenaIntroducida = s.nextLine();
      
      if (!cadenaIntroducida.equals("salir")) {
        if (capitales.containsKey(cadenaIntroducida)) {
          System.out.print("La capital de " + cadenaIntroducida);
          System.out.println(" es " + capitales.get(cadenaIntroducida));
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + cadenaIntroducida + "?: ");
          String capital = s.nextLine();
          capitales.put(cadenaIntroducida, capital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!cadenaIntroducida.equals("salir"));
  }

}
