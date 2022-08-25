package com.ltizzi.primeros.pasos;

public class Testing2 {

  public static void main(String[] args) {

    Cliente pepe = new Cliente("Pepito Pepon", "4678143", "42421490");
    Cuenta cuentaPepe = new Cuenta(99999.99, 33, 1, pepe);
    System.out.println(
        "Cuenta: "
            + cuentaPepe.getNumero()
            + ", Titular: "
            + cuentaPepe.getTitular().getNombre()
            + ", saldo: "
            + cuentaPepe.getSaldo());
  }
}
