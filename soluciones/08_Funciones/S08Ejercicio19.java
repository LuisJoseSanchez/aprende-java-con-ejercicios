/**
 * 8. Funciones
 * 
 * 19. Une y amplía los dos programas anteriores de tal forma que se permita
 *     convertir un número entre cualquiera de las siguientes bases: decimal,
 *     binario, hexadecimal y octal.
 * 
 * @author Luis José Sánchez
 */
import matematicas.Varias;

public class S08Ejercicio19 {

  public static void main(String[] args) {
    
    String resultado = "";
    long numeroIntroducido = 666;
    
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = System.console().readLine();
    
    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    
    switch (opcion) {
      case 1:
        resultado = Long.toString(binarioAOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(binarioADecimal(numeroIntroducido));
        break;
      case 3:
        resultado = binarioAHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(octalABinario(numeroIntroducido));
        break;
      case  5:
        resultado = Long.toString(binarioADecimal(octalABinario(numeroIntroducido)));
        break;
      case  6:
        resultado = binarioAHexadecimal(octalABinario(numeroIntroducido));
        break;
      case  7:
        resultado = Long.toString(decimalABinario((int)numeroIntroducido));
        break;
      case  8:
        resultado = Long.toString(binarioAOctal(decimalABinario((int)numeroIntroducido)));
        break;
      case  9:
        resultado = binarioAHexadecimal(decimalABinario((int)numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(hexadecimalABinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(binarioAOctal(hexadecimalABinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(binarioADecimal(hexadecimalABinario(numeroIntroducidoString)));
        break;
    }
    
    System.out.println(resultado);
  } // main

  /**
   * Pasa un número binario (en base 2) a octal (base 8).
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a octal
   */
  public static long binarioAOctal(long binario) {
    long octal = 1;
  
    while (binario > 0) {
      octal = octal * 10 + (binarioADecimal(binario % 1000));
      binario = binario / 1000;
    };
  
    octal = Varias.pegaPorDetras(octal, 1);
    octal = Varias.voltea(octal);
    octal = Varias.quitaPorDetras(octal, 1);
    octal = Varias.quitaPorDelante(octal, 1);
    
    return octal;
  }
  
  /**
   * Pasa un número binario (en base 2) a decimal (base 10).
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a decimal
   */
  public static long binarioADecimal(long binario) {
    long decimal = 0;
  
    int bits = Varias.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += Varias.digitoN(binario, bits - i - 1) * Varias.potencia(2, i);
    }
      
    return decimal;
  }
  
  /**
   * Pasa un número binario (en base 2) a hexadecimal (base 16).
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a hexadecimal
   */
   public static String binarioAHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
  
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioADecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    };
      
    return hexadecimal;
  }
  
  /**
   * Pasa un número octal (en base 8) a binario (base 2).
   * 
   * @param octal número entero en octal
   * @return      número inicial pasado a binario
   */
  public static long octalABinario(long octal) {
    long binario = 0;
  
    for (int i = 0; i < Varias.digitos(octal); i++) {
      binario = binario * 1000 + decimalABinario(Varias.digitoN(octal, i));
    }
    
    return binario;
  }
  
/**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número entero en base 10
   * @return        número inicial pasado a binario
   */
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = Varias.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = Varias.pegaPorDetras(binario, 1);
    binario = Varias.voltea(binario);
    binario = Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }

  /**
   * Pasa un número hexadecimal (en base 10) a binario (base 2).
   * 
   * @param hexadecimal número entero en hexadecimal
   * @return            número inicial pasado a binario
   */
  public static long hexadecimalABinario(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
  
    for (int i = 0; i < hexadecimal.length(); i++) {
      final long decimal = decimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
      binario = binario * 10000 + decimal;
    }

    return binario;
  }
}
