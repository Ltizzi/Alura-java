package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class CuentaCorriente extends Cuenta {

  public CuentaCorriente(double saldo, int agencia, Cliente titular) {
    super(saldo, agencia, titular);
  }

  @Override
  public void retirar(double retiro) throws SaldoInsuficienteException {
    double comision = 0.2;
    // ya no retira
    super.retirar(retiro + comision);
  }

  @Override
  public void depositar(double deposito) {
    double saldo = this.getSaldo();
    this.setSaldo(saldo + deposito);
  }
}
