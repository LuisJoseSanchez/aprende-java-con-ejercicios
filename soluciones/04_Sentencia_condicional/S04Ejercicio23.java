/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 4. Sentencia condicional.
 *
 * 23. Escribe un programa que calcule el precio final de un producto según su
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
public class S04Ejercicio23 {
  public static void main(String[] args) {

    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
    
    // Calcula el IVA y el precio antes del descuento
    
    int tipoIVANumerico = 0;
    
    switch(tipoIVA) {
      case "general":
        tipoIVANumerico = 21;
        break;
      case "reducido":
        tipoIVANumerico = 10;
        break;
      case "superreducido":
        tipoIVANumerico = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    
    double iva = baseImponible * tipoIVANumerico / 100;
    double precioSinDescuento = baseImponible + iva;
    
    // Calcula el descuento
    
    double descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad": // el precio se reduce a la mitad
        descuento = precioSinDescuento / 2;
        break;
      case "meno5": // se descuentan 5 euros
        descuento = 5;
        break;
      case "5porc": // se descuenta el 5%
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
    
    // Muestra el precio final del producto desglosado
    
    double total = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANumerico, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, descuento);
    System.out.printf("TOTAL                %6.2f", total);
  }
}
