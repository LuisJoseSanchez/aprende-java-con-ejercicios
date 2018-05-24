public class LaFascinanteVidaDeLasAmebas {

  public static void main(String[] args) {
    Ameba a1 = new Ameba();
    a1.come(2);
    System.out.println(a1);
    Ameba a2 = new Ameba();
    a2.come(4);
    System.out.println(a2);
    a1.come(a2);
    System.out.println(a1);
    System.out.println(a2);
    a2.come(3);
    System.out.println(a2);
  }

}
