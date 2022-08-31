package com.ltizzi.herencia.poliformismo.interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Cuenta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total = 1; // static es de la clase, no de la instancia

  public Cuenta(double saldo, int agencia, Cliente titular) {

    this.saldo = saldo;
    if (agencia > 0) {
      this.agencia = agencia;
    }
    if (agencia <= 0) {
      System.out.println("No se permite agencia de número 0 o negativo");
      this.agencia = 1;
    }

    this.numero = total;
    this.titular = titular;
    this.total++;
  }

  public Cuenta(
      double saldo,
      Cliente
          titular) { // un constructor dentro de otro para fixear cierto atributo al mismo tiempo
    // que se permite la sobrecarga
    this(saldo, 33, titular);
  }

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

  public abstract void depositar(double deposito);
  //  {
  //    double saldo = this.getSaldo();
  //    this.setSaldo(saldo + deposito);
  //  }

  public void retirar(double retiro) throws SaldoInsuficienteException {
    // old code que devuelve un boolean
    //    double saldo = this.getSaldo();
    //    if (saldo >= retiro) {
    //      this.setSaldo(saldo - retiro);
    //      return true;
    //
    //    } else {
    //      return false;
    //    }
    if (this.saldo < retiro) {
      throw new SaldoInsuficienteException("No tienes saldo");
    }
    this.saldo -= retiro;
  }

  public boolean transferir(double valor, Cuenta cuentaDestino) {
    double saldo = this.getSaldo();
    if (saldo >= valor) {
      try {
        this.retirar(valor);
      } catch (SaldoInsuficienteException ex) {
        Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("Se ha retirado " + valor + " de la cuenta.");
      cuentaDestino.depositar(valor);
      System.out.println("Se ha depositado " + valor + " en la cuenta destino");
      return true;
    }
    System.out.println("El saldo disponible en la cuenta es menor al monto de la transferencia");
    return false;
  }

  public static void mostrarCuenta(Cuenta cuenta) {
    System.out.println(
        "Cuenta: "
            + cuenta.getNumero()
            + ", Titular: "
            + cuenta.getTitular().getNombre()
            + ", saldo: "
            + cuenta.getSaldo());
  }
}
