package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Gerente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Funcionario;

public class TestReferencias {

  public static void main(String[] args) {

    // EL elemento más genérico puede ser adaptado al elemento más específico
    // funcionario no inicia sesión porque la referencia de funcionario no tiene el método iniciar
    // sesión
    Funcionario funcionario = new Gerente();
    funcionario.setNombre("Tita");
    funcionario.setSalario(2000);

    Gerente gerente = new Gerente();
    gerente.setNombre("Papa");
    gerente.setSalario(10000);

    gerente.iniciarSesion("Alura");
  }
}
