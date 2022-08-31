package com.ltizzi.herencia.poliformismo.interfaces;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaAhorros;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.SaldoInsuficienteException;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCuentaException {

  public static void main(String[] args) {
    Cliente leo = new Cliente();
    Cuenta cuenta = new CuentaAhorros(2000, 12, leo);

    cuenta.depositar(200);
    try {
      cuenta.retirar(2300);
    } catch (SaldoInsuficienteException ex) {
      Logger.getLogger(TestCuentaException.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
