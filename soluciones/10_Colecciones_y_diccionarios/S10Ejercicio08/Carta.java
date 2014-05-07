
public class Carta {

	private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private static String[] p = {"bastos", "copas", "espadas", "oros"};
	
	private String numero;
	private String palo;

	public Carta() {
		this.numero = n[(int)(Math.random()*10)];
		this.palo = p[(int)(Math.random()*4)];
	}
	
	public String getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	public String toString() {
		return this.numero + " de " + this.palo;
	}
}
