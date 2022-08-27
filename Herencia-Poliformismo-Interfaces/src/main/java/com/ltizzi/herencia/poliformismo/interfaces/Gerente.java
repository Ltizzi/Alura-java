package com.ltizzi.herencia.poliformismo.interfaces;

public class Gerente extends Funcionario {

  private String clave;

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

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean iniciarSesion(String clave) {
    return "Alura".equals(clave);
  }
}
