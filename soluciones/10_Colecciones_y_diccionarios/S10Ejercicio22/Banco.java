public class Banco {

  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente();
    CuentaCorriente cuenta2 = new CuentaCorriente(1500);
    CuentaCorriente cuenta3 = new CuentaCorriente(6000);
    cuenta1.ingreso(2000);
    cuenta1.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta1, 100);
    cuenta1.transferencia(cuenta3, 250);
    cuenta3.transferencia(cuenta1, 22);
    cuenta1.movimientos();
  }

}
