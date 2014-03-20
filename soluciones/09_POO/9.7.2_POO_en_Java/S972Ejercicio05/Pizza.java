
public class Pizza {
	
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	
	private String tamano, tipo, estado;
	
	public Pizza(String tipo, String tamano) {
		this.tipo = tipo;
		this.tamano = tamano;
		this.estado = "pedida";
		Pizza.totalPedidas++;
	}
	
	public String toString() {
		return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
	}
	
	public static int getTotalPedidas() {
		return Pizza.totalPedidas;
	}
	
	public static int getTotalServidas() {
		return Pizza.totalServidas;
	}
	
	public void sirve() {
		if (this.estado.equals("pedida")) {
			this.estado = "servida";
			Pizza.totalServidas++;
		} else
			System.out.println("esa pizza ya se ha servido");
	}
}

