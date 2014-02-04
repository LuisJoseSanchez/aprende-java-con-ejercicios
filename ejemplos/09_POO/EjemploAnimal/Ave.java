/**
 * Ave.java
 * Definición de la clase Ave
 * @author Luis José Sánchez
 */

public class Ave extends Animal {
	
	public Ave(Sexo s) {
		super(s);
	}

	public Ave() {
		super();
	}
	
	public void aseate() {
		System.out.println("Me estoy limpiando las plumas");
	}
	
	public void vuela() {
		System.out.println("Estoy volando");
	}
	
}
