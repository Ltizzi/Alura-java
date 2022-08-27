package com.ltizzi.herencia.poliformismo.interfaces;

public class CuentaCorriente extends Cuenta {

  public CuentaCorriente(double saldo, int agencia, Cliente titular) {
    super(saldo, agencia, titular);
  }

  @Override
  public boolean retirar(double retiro) {
    double comision = 0.2;
    return super.retirar(retiro + comision);
  }

  @Override
  public void depositar(double deposito) {
    double saldo = this.getSaldo();
    this.setSaldo(saldo + deposito);
  }
}
