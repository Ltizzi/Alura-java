package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class CuentaAhorros extends Cuenta {

  public CuentaAhorros(double saldo, int agencia, Cliente titular) {
    super(saldo, agencia, titular);
  }

  @Override
  public void depositar(double deposito) {
    double saldo = this.getSaldo();
    this.setSaldo(saldo + deposito);
  }
}
