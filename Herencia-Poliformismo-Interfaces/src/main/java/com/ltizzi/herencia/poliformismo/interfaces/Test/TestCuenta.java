package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaAhorros;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaCorriente;

public class TestCuenta {

  public static void main(String[] args) {

    Cliente leo = new Cliente();
    CuentaCorriente cc = new CuentaCorriente(0, 1, leo);
    CuentaAhorros ca = new CuentaAhorros(0, 1, leo);

    cc.depositar(2000);
    cc.transferir(1000, ca);
    System.out.println(cc.getSaldo());
  }
}
