/**
 * Sentencia múltiple (switch) 
 *
 * @author Luis José Sánchez
 */
public class SentenciaSwitch {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un numero de mes: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    String nombreDelMes;
    
    switch (mes) {
      case 1:
        nombreDelMes = "enero";
        break;
      case 2:
        nombreDelMes = "febrero";
        break;
      case 3:
        nombreDelMes = "marzo";
        break;
      case 4:
        nombreDelMes = "abril";
        break;
      case 5:
        nombreDelMes = "mayo";
        break;
      case 6:
        nombreDelMes = "junio";
        break;
      case 7:
        nombreDelMes = "julio";
        break;
      case 8:
        nombreDelMes = "agosto";
        break;
      case 9:
        nombreDelMes = "septiembre";
        break;
      case 10:
        nombreDelMes = "octubre";
        break;
      case 11:
        nombreDelMes = "noviembre";
        break;
      case 12:
        nombreDelMes = "diciembre";
        break;
      default:
        nombreDelMes = "no existe ese mes";
    }

    System.out.println("Mes " + mes + ": " + nombreDelMes);
  }
}
