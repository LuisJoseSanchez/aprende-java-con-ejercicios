package ejercicio2;

public class PruebaTerminales {

  public static void main(String[] args) {
//    Terminal t1 = new Terminal("678 11 22 33");
//    Terminal t2 = new Terminal("644 74 44 69");
//    Terminal t3 = new Terminal("622 32 89 09");
//    Terminal t4 = new Terminal("664 73 98 18");
//    System.out.println(t1);
//    System.out.println(t2);
//    t1.llama(t2, 320);
//    t1.llama(t3, 200);
//    System.out.println(t1);
//    System.out.println(t2);
//    System.out.println(t3);
//    System.out.println(t4);

    Movil m1 = new Movil("678 11 22 33", "rata");
    Movil m2 = new Movil("644 74 44 69", "mono");
    Movil m3 = new Movil("622 32 89 09", "bisonte");
    System.out.println(m1);
    System.out.println(m2);
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }

}
