/*
 * 6. Implementa el control de acceso al área restringida de un programa.
 *    Se debe pedir un nombre de usuario y una contraseña. Si el usuario
 *    introduce los datos correctamente, el programa dirá "Ha accedido al
 *    área restringida". El usuario tendrá un máximo de 3 oportunidades.
 *    Si se agotan las oportunidades el programa dirá "Lo siento, no tiene
 *    acceso al área restringida". Los nombres de usuario con sus
 *    correspondientes contraseñas deben estar almacenados en una
 *    estructura de la clase HasMap .
 * 
 * @author Luis José Sánchez
 */

import java.util.*;

public class S10Ejercicio06 {
   public static void main(String[] args) {

   		HashMap<String, String> m = new HashMap<String, String>();
        
        String usuario, clave;
        boolean entra = false;
        int intentos = 0;
        
        m.put("admin", "224477");
        m.put("maria", "ztf99");      
        m.put("pepe", "zxcvb");

     
        
        while ((!entra) && (intentos++ < 3)) {
			
			System.out.print("Usuario: ");
			usuario = System.console().readLine();		
			System.out.print("Contraseña: ");
			clave = System.console().readLine();
			
			if (m.containsKey(usuario))
				if (m.get(usuario).equals(clave)) {
					System.out.print("Ha accedido al área restringida");
					entra = true;
				}
		}
		
		if (!entra)
			System.out.print("Lo siento, no tiene acceso al área restringida");
   }
}
