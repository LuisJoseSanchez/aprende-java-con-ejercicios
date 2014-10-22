/**
 * 4. Sentencia Condicional
 *
 * 10. Escribe un programa que nos diga el horóscopo a partir del día y
 *     el mes de nacimiento.
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio10 {

  public static void main(String[] args) {
    
    String horoscopo = "";

    System.out.println("Este programa le dirá cuál es su horóscopo a partir de su fecha de nacimiento.");
    System.out.print("Introduzca el número del mes en que nació (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca el día: ");
    int dia = Integer.parseInt(System.console().readLine());
  
    switch(mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "capricornio";
        } else {
          horoscopo = "acuario";
        }
        break;
      case 2:
        if (dia < 20) {
          horoscopo = "acuario";
        } else {
          horoscopo = "piscis";
        }
        break;
      case 3:
        if (dia < 21) {
          horoscopo = "piscis";
        } else {
          horoscopo = "aries";
        }
        break;
      case 4:
        if (dia < 21) {
          horoscopo = "aries";
        } else {
          horoscopo = "tauro";
        }
        break;
      case 5:
        if (dia < 20) {
          horoscopo = "tauro";
        } else {
          horoscopo = "géminis";
        }
        break;
      case 6:
        if (dia < 22) {
          horoscopo = "géminis";
        } else {
          horoscopo = "cáncer";
        }
        break;
      case 7:
        if (dia < 22) {
          horoscopo = "cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case 8:
        if (dia < 24) {
          horoscopo = "leo";
        } else {
          horoscopo = "virgo";
        }
        break;
      case 9:
        if (dia < 23) {
          horoscopo = "virgo";
        } else {
          horoscopo = "libra";
        }
        break;
      case 10:
        if (dia < 23) {
          horoscopo = "libra";
        } else {
          horoscopo = "escorpio";
        }
        break;
      case 11:
        if (dia < 23) {
          horoscopo = "escorpio";
        } else {
          horoscopo = "sagitario";
        }
        break;
      case 12:
        if (dia < 21) {
          horoscopo = "sagitario";
        } else {
          horoscopo = "capricornio";
        }
        break;
      default:
    }

    System.out.print("Su horóscopo es " + horoscopo);

  }
}
