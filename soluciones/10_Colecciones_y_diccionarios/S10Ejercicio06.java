/**
 * 6. Implementa el control de acceso al área restringida de un
 *    programa. Se debe pedir un nombre de usuario y una contraseña. Si
 *    el usuario introduce los datos correctamente, el programa dirá
 *    "Ha accedido al área restringida". El usuario tendrá un máximo de
 *    3 oportunidades. Si se agotan las oportunidades el programa dirá
 *    "Lo siento, no tiene acceso al área restringida". Los nombres de
 *    usuario con sus correspondientes contraseñas deben estar
 *    almacenados en una estructura de la clase HasMap.
 * 
 * @author Luis José Sánchez
 */
import java.util.*;

public class S10Ejercicio06 {
  public static void main(String[] args) {

    HashMap<String, String> m = new HashMap<String, String>();

    String usuario;
    String clave;
    boolean entra = false;
    int oportunidades = 3;

    m.put("admin", "224477");
    m.put("maria", "ztf99");
    m.put("pepe", "zxcvb");

    System.out.println("Por favor, introduzca nombre de usuario y "
          + "contraseña para acceder al área restringida.\nDispone de "
          + "3 intentos.");

    do {
      System.out.print("Usuario: ");
      usuario = System.console().readLine();
      System.out.print("Contraseña: ");
      clave = System.console().readLine();

      if (m.containsKey(usuario)) { // el usuario existe
        if (m.get(usuario).equals(clave)) {
          System.out.println("Ha accedido al área restringida");
          entra = true;
        } else {
          System.out.println("Contraseña incorrecta");
        }
      } else { // el usuario no existe
        System.out.println("El usuario introducido no existe");
      }

      oportunidades--;

      if (!entra && (oportunidades > 0)) {
        System.out.println("Le quedan " + (oportunidades) + " oportunidades");
      }

    } while ((!entra) && (oportunidades > 0));

    if (!entra){
      System.out.print("Lo siento, no tiene acceso al área restringida");
    }
  }
}
