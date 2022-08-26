package com.ltizzi.primeros.pasos;

public class Testing2 {

  public static void main(String[] args) {

    Cliente pepe = new Cliente("Pepito Pepon", "4678143", "42421490");
    Cuenta cuentaPepe = new Cuenta(99999.99, 33, pepe);

    Cuenta segundaCuentaPepe = new Cuenta(45999.45, 33, pepe);

    Cuenta.mostrarCuenta(cuentaPepe);
    Cuenta.mostrarCuenta(segundaCuentaPepe);
  }
}
