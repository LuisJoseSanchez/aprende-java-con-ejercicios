/**
* Lectura de datos desde teclado
* Para IDEs como Eclipse, Netbeans o JavaEdit
*
* @author Luis J. Sánchez
*
*/
package leedatoside;

import java.util.Scanner;
public class LeeDatosIDE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Indique su nombre: ");
        nombre = s.nextLine();
        System.out.print("Indique su edad: ");
        edad = Integer.parseInt(s.nextLine());
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
    }
}