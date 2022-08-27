package com.ltizzi.herencia.poliformismo.interfaces;

public class TestControlBonificacion {

  public static void main(String[] args) {

    Funcionario pepe = new Contador();

    pepe.setSalario(2000);

    Gerente popi = new Gerente();
    popi.setSalario(10000);

    Contador nini = new Contador();
    nini.setSalario(5000);

    ControlBonificacion control = new ControlBonificacion();

    control.registrarSalario(pepe);
    control.registrarSalario(popi);
    control.registrarSalario(nini);
  }
}
