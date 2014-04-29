/*
 * 5. Realiza de nuevo el ejercicio de la colección de discos pero
 *    utilizando esta vez una lista para almacenar la información
 *    sobre los discos en lugar de un array convencional. Comprobarás
 *    que el código se simplifica notablemente ¿Cuánto ocupa el programa
 *    original hecho con un array? ¿Cuánto ocupa este nuevo programa
 *    hecho con una lista?
 *         
 * @author Luis José Sánchez
 *                 
 */

import java.util.*;

public class ColeccionDeDiscosConArrayList {

	static ArrayList<Disco> album = new ArrayList<Disco>();

	public static void main(String[] args) {

		int i;
		String codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducidaString;
		int opcion, opcionListado, duracionIntroducida, limiteInferior, limiteSuperior;

		do {
			System.out.println("\n\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(System.console().readLine());
			
			switch (opcion) {
			
			// LISTADO //////////////////////////////////////////////////////////////////
			case 1:
				do {
					System.out.println("\nLISTADO\n=======");
					System.out.println("1. Completo");
					System.out.println("2. Por autor");
					System.out.println("3. Por género");
					System.out.println("4. En un rango de duración");
					System.out.println("5. Menú principal");
					System.out.print("Introduzca una opción: ");
					opcionListado = Integer.parseInt(System.console().readLine());				
					
					switch (opcionListado) {

						case 1: // Listado completo ////////////////		
							
							for(Disco d : album)
								System.out.println(d);							
							break;
										
						case 2: // Listado por autor ////////////////
	
							System.out.print("Introduzca el autor: ");
							autorIntroducido = System.console().readLine();
							
							for(Disco d : album)
								if(d.getAutor().equals(autorIntroducido))
									System.out.println(d);
							break;
							
						case 3: // Listado por género ////////////////
	
							System.out.print("Introduzca el género: ");
							generoIntroducido = System.console().readLine();
							
							for(Disco d : album)
								if(d.getGenero().equals(generoIntroducido))
									System.out.println(d);							
							break;
	
						case 4: // Listado en un rango de duración ////
	
							System.out.println("Establezca el intervalo para la duración");
							System.out.print("Introduzca el límite inferior de duración en minutos: ");
							limiteInferior = Integer.parseInt(System.console().readLine());
							System.out.print("Introduzca el límite superior de duración en minutos: ");
							limiteSuperior = Integer.parseInt(System.console().readLine());

							for(Disco d : album)
								if((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior))
									System.out.println(d);					
					} // switch (opcionListado)
		
				} while (opcionListado != 5);

				break;
			
			// NUEVO DISCO //////////////////////////////////////////////////////////////
			case 2:
				System.out.println("\nNUEVO DISCO\n===========");

				System.out.println("Por favor, introduzca los datos del disco.");	
				System.out.print("Código: ");
				codigoIntroducido = System.console().readLine();

				while (posicion(codigoIntroducido) != -1) {
					System.out.println("Ese código ya existe en la base de datos." + posicion(codigoIntroducido)
					);
					System.out.print("Introduzca otro código: ");
					codigoIntroducido = System.console().readLine();
				}
				
				System.out.print("Autor: ");
				autorIntroducido = System.console().readLine();				
				System.out.print("Título: ");
				tituloIntroducido = System.console().readLine();			
				System.out.print("Género: ");
				generoIntroducido = System.console().readLine();			
				System.out.print("Duración: ");
				duracionIntroducida = Integer.parseInt(System.console().readLine());
				
				album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
				
				break;
				
			// MODIFICAR ////////////////////////////////////////////////////////////////			
			case 3:
				System.out.println("\nMODIFICAR\n===========");
				
				System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
				codigoIntroducido = System.console().readLine();

				while (posicion(codigoIntroducido) == -1) {
					System.out.print("Ese código no existe.\nIntroduzca otro código: ");
					codigoIntroducido = System.console().readLine();
				}	
				i = posicion(codigoIntroducido);
				
				System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
	
				System.out.println("Código: " + album.get(i).getCodigo());
				System.out.print("Nuevo código: ");
				codigoIntroducido = System.console().readLine();
				if (!codigoIntroducido.equals(""))
					album.get(i).setCodigo(codigoIntroducido);
				
				System.out.println("Autor: " + album.get(i).getAutor());
				System.out.print("Nuevo autor: ");
				autorIntroducido = System.console().readLine();
				if (!autorIntroducido.equals(""))
					album.get(i).setAutor(autorIntroducido);
				
				System.out.println("Título: " + album.get(i).getTitulo());
				System.out.print("Nuevo título: ");
				tituloIntroducido = System.console().readLine();
				if (!tituloIntroducido.equals(""))
					album.get(i).setTitulo(tituloIntroducido);
				
				System.out.println("Género: " + album.get(i).getGenero());
				System.out.print("Nuevo género: ");
				generoIntroducido = System.console().readLine();
				if (!generoIntroducido.equals(""))
					album.get(i).setGenero(generoIntroducido);
				
				System.out.println("Duración: " + album.get(i).getDuracion());
				System.out.print("Duración: ");
				duracionIntroducidaString = System.console().readLine();
				if (!duracionIntroducidaString.equals(""))
					album.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
				
				break;

			// BORRAR ///////////////////////////////////////////////////////////////////			
			case 4:
				System.out.println("\nBORRAR\n======");
				
				System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
				codigoIntroducido = System.console().readLine();

				if (posicion(codigoIntroducido) == -1)
					System.out.println("Lo siento, el código introducido no existe.");
				else {
					album.remove(posicion(codigoIntroducido));
					System.out.println("Album borrado.");
				}
			} // switch		
		} while (opcion != 5);
	}
		
	// Devuelve la posición del disco en el ArrayList o -1 si no existe.
	
	static public int posicion(String codigo) {
		int i = -1;
		for (Disco d : album) {
			i++;
			if (d.getCodigo().equals(codigo))
				return i;
		}
		return -1;
	}
}
