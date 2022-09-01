package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Contador;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Gerente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Funcionario;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.ControlBonificacion;

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
