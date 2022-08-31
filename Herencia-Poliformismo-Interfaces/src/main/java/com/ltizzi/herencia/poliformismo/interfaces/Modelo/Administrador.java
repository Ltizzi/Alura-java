package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class Administrador extends Funcionario implements Auth {

  private AuthUtil util;

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
