import java.util.Scanner;

public class Gestisimal {

  // N determina el tamaño del array
  static final int N = 100;

  static Articulo[] articulos = new Articulo[N];

  public static void main(String[] args) {

    // Inicializa el array
    for(int i = 0; i < N; i++) {
      Gestisimal.articulos[i] = new Articulo();
    }

    int opcion;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigo;
    String codigoIntroducido = "";
    String descripcionIntroducida;

    Scanner s = new Scanner(System.in);

    // MENU ///////////////////////////////////////////////////////////////////
    do {
      pintaTitulo("G E S T I S I M A L");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {

        // LISTADO ////////////////////////////////////////////////////////////
        case 1:
          pintaTitulo("LISTADO");
          
          for(Articulo a : articulos) {
            if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
            }
          }
  
          break;

        // ALTA ///////////////////////////////////////////////////////////////
        case 2:
          pintaTitulo("NUEVO ARTÍCULO");
          
          if (primeraPosicionLibre() == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {
            
            // Introducción de datos 
            System.out.println("Por favor, introduzca los datos del artículo.");  
            System.out.print("Código: ");
            
            // Comprueba que el código introducido no se repita
            do {
              codigoIntroducido = s.nextLine();
              if (existeCodigo(codigoIntroducido)) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } while (existeCodigo(codigoIntroducido));
            
            System.out.print("Descripcion: ");
            descripcionIntroducida = s.nextLine();
            System.out.print("Precio de compra: ");
            precioDeCompraIntroducido = Double.parseDouble(s.nextLine());
            System.out.print("Precio de venta: ");
            precioDeVentaIntroducido = Double.parseDouble(s.nextLine());
            System.out.print("Stock: ");
            stockIntroducido = Integer.parseInt(s.nextLine());

            // Crea el nuevo artículo
            articulos[primeraPosicionLibre()] = new Articulo(
              codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido,
              precioDeVentaIntroducido, stockIntroducido);
          }
          
          break;

        // BAJA ///////////////////////////////////////////////////////////////
        case 3:
          pintaTitulo("BAJA");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();
    
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulos[posicionConCodigo(codigoIntroducido)].setCodigo("LIBRE");
            System.out.println("Artículo borrado.");  
          }
          
          break;
          
        // MODIFICACIÓN ///////////////////////////////////////////////////////
        case 4:
          pintaTitulo("MODIFICACIÓN");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.print("Introduzca los nuevos datos del artículo");
            System.out.println(" o INTRO para dejarlos igual.");
      
            int i = posicionConCodigo(codigoIntroducido);

            System.out.println("Código: " + articulos[i].getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = s.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulos[i].setCodigo(codigoIntroducido);
            }
            
            System.out.println("Descripción: " + articulos[i].getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntroducida = s.nextLine();
            if (!descripcionIntroducida.equals("")) {
              articulos[i].setDescripcion(descripcionIntroducida);
            }
            
            System.out.println("Precio de compra: " + articulos[i].getPrecioDeCompra());
            System.out.print("Nuevo precio de compra: ");
            String precioDeCompraIntroducidoString = s.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulos[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
            }
            System.out.println("Precio de venta: " + articulos[i].getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            String precioDeVentaIntroducidoString = s.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulos[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }
            System.out.println("Stock: " + articulos[i].getStock());
            System.out.print("Nuevo stock: ");
            String stockIntroducidoString = s.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulos[i].setStock(Integer.parseInt(stockIntroducidoString));
            }
          }
          
          break;
  
          // ENTRADA DE MERCANCÍA /////////////////////////////////////////////
          case 5:
            pintaTitulo("ENTRADA DE MERCANCÍA");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = s.nextLine();
        
            if (!existeCodigo(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              int i = posicionConCodigo(codigoIntroducido);
              System.out.println("Entrada de mercancía del siguiente artículo: ");
              System.out.println(articulos[i]);
              System.out.print("Introduzca el número de unidades que entran: ");
              String stockIntroducidoString = s.nextLine();
              articulos[i].setStock(
                Integer.parseInt(stockIntroducidoString) + articulos[i].getStock());
              System.out.println("La mercancía ha entrado en el almacén.");  
            }
            
            break;

            // SALIDA DE MERCANCÍA ////////////////////////////////////////////
            case 6:
              pintaTitulo("SALIDA DE MERCANCÍA");
              
              System.out.print("Por favor, introduzca el código del artículo: ");
              codigoIntroducido = s.nextLine();

              if (!existeCodigo(codigoIntroducido)) {
                System.out.println("Lo siento, el código introducido no existe.");
              } else {
                int i = posicionConCodigo(codigoIntroducido);
                System.out.println("Salida de mercancía del siguiente artículo: ");
                System.out.println(articulos[i]);
                System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                stockIntroducido = Integer.parseInt(s.nextLine());
                if (articulos[i].getStock() - stockIntroducido > 0) {
                  articulos[i].setStock(articulos[i].getStock() - stockIntroducido);
                  System.out.println("La mercancía ha salido del almacén.");
                } else {
                  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                }
              }
              
              break;
      } // switch
    } while (opcion != 7);
  }

  // FUNCIONES ////////////////////////////////////////////////////////////////

  /**
   * Busca la primera posición libre del array.
   * Si no quedan huecos, devuelve -1.
   * 
   * @return primera posición libre del array o -1 si no quedan huecos
   */
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * Dice si existe o no un artículo con un determinado código.
   * 
   * @return true si existe el código y false si no existe
   */
  public static boolean existeCodigo(String codigo) {
    for (Articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Pinta un título con subrayado.
   */
  public static void pintaTitulo(String titulo) {
    System.out.println("\n" + titulo);
    for (int i = 0; i < titulo.length(); i++) {
      System.out.print("=");  
    }
    System.out.println();
  }

  /**
   * Devuelve la posición dentro del array en la que se encuentra un artículo
   * con un determinado código.
   * Si el código no se encuentra, devuelve -1.
   * 
   * @return posición dentro del array en la que se encuentra un artículo
   */
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  
}