/**
 * 
 * 5. Bucles
 * 
 * 30. Realiza una programa que calcule las horas transcurridas entre
 *     dos horas de dos días de la semana. No se tendrán en cuenta los
 *     minutos ni los segundos. El día de la semana se puede pedir como
 *     un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
 *     Se debe comprobar que el usuario introduce los datos correctamente
 *     y que el segundo día es posterior al primero.
 *     Ejemplo:
 *     Por favor, introduzca la primera hora.
 *     Día: lunes
 *     Hora: 18
 *     Por favor, introduzca la segunda hora.
 *     Día: martes
 *     Hora: 20
 *     Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * 
 * @author Luis José Sánchez
 * 
 */
 
public class S05Ejercicio30 {

	public static void main(String[] args) {
		
			int primerDia = 0, segundoDia = 0, primeraHora, segundaHora;
			String primerDiaString, segundoDiaString;
			boolean datosCorrectos = true;
			// Recogida de datos /////////////////////////////////////
			
			do {
				System.out.println("\nPor favor, introduzca la primera hora.");
				System.out.print("Día: ");
				primerDiaString = System.console().readLine();
				System.out.print("Hora: ");
				primeraHora = Integer.parseInt(System.console().readLine());
				
				switch(primerDiaString) {
					case "lunes":		primerDia = 1; break;
					case "martes":		primerDia = 2; break;
					case "miércoles":	primerDia = 3; break;
					case "jueves":		primerDia = 4; break;
					case "viernes":		primerDia = 5; break;
					case "sábado":		primerDia = 6; break;
					case "domingo":		primerDia = 7; break;
					default:			primerDia = 0;
				}
				
				System.out.println("Por favor, introduzca la segunda hora.");
				System.out.print("Día: ");
				segundoDiaString = System.console().readLine();
				System.out.print("Hora: ");
				segundaHora = Integer.parseInt(System.console().readLine());
				
				switch(segundoDiaString) {
					case "lunes":		segundoDia = 1; break;
					case "martes":		segundoDia = 2; break;
					case "miércoles":	segundoDia = 3; break;
					case "jueves":		segundoDia = 4; break;
					case "viernes":		segundoDia = 5; break;
					case "sábado":		segundoDia = 6; break;
					case "domingo":		segundoDia = 7; break;
					default:			segundoDia = 0;
				}
				
				datosCorrectos = true;
				
				if (segundoDia <= primerDia) {
					System.out.println("El segundo día debe ser posterior al primero.");
					datosCorrectos = false;
				}
				
				if ((primerDia == 0) || (segundoDia == 0)) {
					System.out.println("No se ha introducido correctamente el día de la semana.");
					System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
					datosCorrectos = false;
				}
				
				if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
					System.out.println("No se ha introducido correctamente la hora del día.");
					System.out.println("Las horas válidas están entre 0 y 23.");
					datosCorrectos = false;
				}
				
			} while (!datosCorrectos);
			
			// Fin de la recogida de datos ///////////////////////////
			
			System.out.print("Entre las " + primeraHora + ":00h del " + primerDiaString);
			System.out.print(" y las " + segundaHora + ":00h del " + segundoDiaString);
			System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");

	}
}
