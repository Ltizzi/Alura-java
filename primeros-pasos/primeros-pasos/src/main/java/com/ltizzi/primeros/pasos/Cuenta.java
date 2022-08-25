package com.ltizzi.primeros.pasos;

public class Cuenta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  //  private String titular;
  //  private String documento;
  //  private String telefono;

  public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
    this.saldo = saldo;
    this.agencia = agencia;
    this.numero = numero;
    this.titular = titular;
  }

  public Cuenta() {}

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  // metodos

  public void depositar(double deposito) {
    double saldo = this.getSaldo();
    this.setSaldo(saldo + deposito);
  }

  public boolean retirar(double retiro) {
    double saldo = this.getSaldo();
    if (saldo >= retiro) {
      this.setSaldo(saldo - retiro);
      return true;

    } else {
      return false;
    }
  }

  public boolean transferir(double valor, Cuenta cuentaDestino) {
    double saldo = this.getSaldo();
    if (saldo >= valor) {
      this.retirar(valor);
      System.out.println("Se ha retirado " + valor + " de la cuenta.");
      cuentaDestino.depositar(valor);
      System.out.println("Se ha depositado " + valor + " en la cuenta destino");
      return true;
    }
    System.out.println("El saldo disponible en la cuenta es menor al monto de la transferencia");
    return false;
  }
}
