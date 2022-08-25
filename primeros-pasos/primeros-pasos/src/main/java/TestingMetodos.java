import com.ltizzi.primeros.pasos.Cuenta;

public class TestingMetodos {

  public static void main(String[] args) {

    Cuenta miCuenta = new Cuenta();

    miCuenta.setSaldo(99999.99);
    miCuenta.depositar(2000.00);
    System.out.println(miCuenta.getSaldo());

    miCuenta.retirar(5000.00);
    System.out.println("El saldo nuevo es :" + miCuenta.getSaldo());

    Cuenta cuentaPirata = new Cuenta();

    boolean estadoTransferencia = miCuenta.transferir(5000.00, cuentaPirata);
    if (estadoTransferencia) {
      System.out.println("La transferencia fue exitosa");
      System.out.println("El saldo de la cuenta Pirata es " + cuentaPirata.getSaldo());
    } else {
      System.out.println("La transferencia fue fallida");
    }
  }
}
