package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class Gerente extends Funcionario implements Auth {

  private AuthUtil util;

  public Gerente(String nombre, String documento, double salario) {
    super(nombre, documento, salario);
  }

  public Gerente() {}

  @Override
  // sobreescritura
  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE GERENTE");
    return super.getSalario() + this.getSalario() + 0.05;
  }

  @Override
  public void setClave(String clave) {
    this.util.setClave(clave);
  }

  @Override
  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }
}
