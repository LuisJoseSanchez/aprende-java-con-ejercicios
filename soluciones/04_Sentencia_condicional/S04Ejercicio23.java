/**
 * 3. Lectura de datos desde teclado
 *
 * 12. Escribe un programa que calcule el precio final de un producto según su
 *     base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 *     reducido o superreducido) y el código promocional. Los tipos de IVA general,
 *     reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 *     promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *     respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 *     se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
 *     si se muestran los valores correctos, aunque los números no estén tabulados.
 * 
 *     Ejemplo:
 *     Introduzca la base imponible: 25
 *     Introduzca el tipo de IVA (general, reducido o superreducido): reducido
 *     Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
 *     Base imponible        25.00
 *     IVA (10%)              2.50
 *     Precio con IVA        27.50
 *     Cód. promo. (mitad): -13.75
 *     TOTAL                 13.75
 *
 * @author Luis José Sánchez
 */
public class S03Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
    
    // Calcula el IVA y el precio antes del descuento
    
    switch(tipoIVA) {
      
    }
    
    double iva = 
    
    // Calcula el descuento
    
    // Muestra el precio final del producto desglosado
    
    System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb.");
  }
}
