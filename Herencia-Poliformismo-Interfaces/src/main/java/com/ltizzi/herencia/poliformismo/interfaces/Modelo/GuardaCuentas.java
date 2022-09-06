package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

/**
 * @author ltizzi
 */
public class GuardaCuentas {

  // crear un objeto para guadar muchas cuentas
  // permitir agregar cuentas con un metodo
  // guardaCUentas.adiciona(cuenta);
  // obtener, remover, etc.

  Cuenta[] cuentas = new Cuenta[10];
  static int index = 0;

  public void add(Cuenta cc) {
    cuentas[index] = cc;
    index++;
  }

  public Cuenta obtener(int index) {
    return cuentas[index];
  }
}
