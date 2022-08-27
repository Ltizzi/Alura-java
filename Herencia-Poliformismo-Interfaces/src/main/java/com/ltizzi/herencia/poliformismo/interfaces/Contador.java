package com.ltizzi.herencia.poliformismo.interfaces;

public class Contador extends Funcionario {

  @Override
  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE CONTADOR");
    return 200;
  }
}
