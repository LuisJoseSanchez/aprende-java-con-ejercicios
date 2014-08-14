/*
 *
 * Ejemplo de uso de la clase File
 * Escritura en un fichero de texto
 *
 */

import java.io.*;

class EjemploFichero02 {

	public static void main(String[] args) {

	try {	
		BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
		
		bw.write("naranja\n");
		bw.write("mango\n");
		bw.write("chirimoya\n");
		
		bw.close();
		
		} catch (IOException ioe) {
			System.out.println("No se ha podido escribir en el fichero");	
		}
	}
}
