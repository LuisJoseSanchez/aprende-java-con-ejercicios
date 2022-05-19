import java.util.Scanner;

public class ColeccionDeDiscosMejorado {
  public static void main(String[] args) {
    // N determina el tamaño del array
    final int N = 100;

    // Crea el array de discos
    Disco[] discos = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for (int i = 0; i < N; i++) {
      discos[i] = new Disco();
    }

    // Carga varios discos
    discos[0] = new Disco(
        "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    discos[1] = new Disco(
        "FGHQ64", "Metallica", "Black album", "hard rock", 46);
    discos[2] = new Disco(
        "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    String codigoIntroducido = "";
    String codigo;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int opcion;
    int duracionIntroducida;
    Scanner s = new Scanner(System.in);

    // Menu
    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {

        /////////////////////////////////////////////////////////////////////////////
        // LISTADO //////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////

        case 1:
          int opcionListado;

          do {
            System.out.println("\nLISTADO");
            System.out.println("=======");
            System.out.println("1. Completo");
            System.out.println("2. Por autor");
            System.out.println("3. Por género");
            System.out.println("4. En un rango de duración");
            System.out.println("5. Menú principal");
            System.out.print("Introduzca una opción: ");
            opcionListado = Integer.parseInt(s.nextLine());

            switch (opcionListado) {

              case 1: // Listado completo ////////////////

                System.out.println("\nLISTADO");
                System.out.println("=======");

                for (Disco d : discos) {
                  if (!d.getCodigo().equals("LIBRE")) {
                    System.out.println(d);
                  }
                }

                break;

              case 2: // Listado por autor ////////////////

                System.out.print("Introduzca el autor: ");
                autorIntroducido = s.nextLine();

                System.out.println("\nLISTADO POR AUTOR");
                System.out.println("=================");

                for (Disco d : discos) {
                  if (d.getAutor().equals(autorIntroducido)) {
                    System.out.println(d);
                  }
                }

                break;

              case 3: // Listado por género ////////////////

                System.out.print("Introduzca el género: ");
                generoIntroducido = s.nextLine();

                System.out.println("\nLISTADO POR GÉNERO");
                System.out.println("==================");

                for (Disco d : discos) {
                  if ((!d.getCodigo().equals("LIBRE"))
                    && d.getGenero().equals(generoIntroducido)) {
                    System.out.println(d);
                  }
                }

                break;

              case 4: // Listado en un rango de duración ////////////////

                System.out.println("Establezca el intervalo para la duración");
                System.out.print("Límite inferior de duración en minutos: ");
                final int limiteInferior = Integer.parseInt(s.nextLine());
                System.out.print("Límite superior de duración en minutos: ");
                final int limiteSuperior = Integer.parseInt(s.nextLine());

                for (Disco d : discos) {
                  if ((!d.getCodigo().equals("LIBRE"))
                    && (d.getDuracion() <= limiteSuperior)
                    && (d.getDuracion() >= limiteInferior)) {
                    System.out.println(d);
                  }
                }

            } // switch (opcionListado)
          } while (opcionListado != 5);

          break;

        /////////////////////////////////////////////////////////////////////////////
        // NUEVO DISCO //////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          // Busca la primera posición libre del array
          int primeraLibre = 0;
          codigo = discos[primeraLibre].getCodigo();
          while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
            primeraLibre++;
            if (primeraLibre < N) {
              codigo = discos[primeraLibre].getCodigo();
            }
          }

          if (primeraLibre == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {
            System.out.println("Por favor, introduzca los datos del disco.");
            System.out.print("Código: ");

            // Comprueba que el código introducido no se repita
            boolean existeCodigo = true;
            while (existeCodigo) {
              existeCodigo = false;
              codigoIntroducido = s.nextLine();

              for (Disco d : discos)
                if (codigoIntroducido.equals(d.getCodigo())) {
                  existeCodigo = true;
                }

              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } // while (existeCodigo)

            System.out.print("Autor: ");
            autorIntroducido = s.nextLine();
            System.out.print("Título: ");
            tituloIntroducido = s.nextLine();
            System.out.print("Género: ");
            generoIntroducido = s.nextLine();
            System.out.print("Duración: ");
            duracionIntroducida = Integer.parseInt(s.nextLine());
            discos[primeraLibre] = new Disco(
              codigoIntroducido, autorIntroducido, tituloIntroducido,
              generoIntroducido, duracionIntroducida);
          }

          break;

        /////////////////////////////////////////////////////////////////////////////
        // MODIFICAR ////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////

        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("===========");

          System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
          codigoIntroducido = s.nextLine();

          int i = -1;
          do {
            i++;
          } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));

          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

          System.out.println("Código: " + discos[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            discos[i].setCodigo(codigoIntroducido);
          }

          System.out.println("Autor: " + discos[i].getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = s.nextLine();
          if (!autorIntroducido.equals("")) {
            discos[i].setAutor(autorIntroducido);
          }
          System.out.println("Título: " + discos[i].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            discos[i].setTitulo(tituloIntroducido);
          }
          System.out.println("Género: " + discos[i].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            discos[i].setGenero(generoIntroducido);
          }
          System.out.println("Duración: " + discos[i].getDuracion());
          System.out.print("Duración: ");
          final String duracionIntroducidaString = s.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }
          break;

        /////////////////////////////////////////////////////////////////////////////
        // BORRAR ///////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          codigo = "";
          do {
            System.out.println(i);
            i++;
            if (i < N) {
              codigo = discos[i].getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < N));

          System.out.println(i);

          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            discos[i].setCodigo("LIBRE");
            System.out.println("Album borrado.");
          }

      } // switch
    } while (opcion != 5);
  }
}
