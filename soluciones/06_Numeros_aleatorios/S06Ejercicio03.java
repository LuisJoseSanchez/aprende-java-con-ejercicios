/**
 * 
 * 6. Números aleatorios
 * 
 * 3. Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
 *    48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 *
 * @author Luis José Sánchez
 */

public class S06Ejercicio03 {

	public static void main(String[] args) {
		
		String palo = "", carta = "";
		int numeroPalo = (int)(Math.random()*4) + 1;
		
		switch(numeroPalo) {
			case 1: palo = "oros"; break;
			case 2: palo = "copas"; break;
			case 3: palo = "bastos"; break;
			case 4: palo = "espadas";
		}

		int numeroCarta = (int)(Math.random()*13) + 1;
		
		switch(numeroCarta) {
			case 1:  carta = "As"; break;
			case 11: carta = "Sota"; break;
			case 12: carta = "Caballo"; break;
			case 13: carta = "Rey"; break;
			default: carta = String.valueOf(numeroCarta);
		}
		
		System.out.println(carta + " de " + palo);
	}
}
