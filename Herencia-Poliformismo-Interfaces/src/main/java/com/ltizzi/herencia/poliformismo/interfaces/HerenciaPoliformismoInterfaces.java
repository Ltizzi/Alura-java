package com.ltizzi.herencia.poliformismo.interfaces;

public class HerenciaPoliformismoInterfaces {

  public static void main(String[] args) {

    Funcionario leo = new Contador();

    System.out.println(leo.toString());
    System.out.println("Bonificacion: " + leo.getBonificacion());

    Gerente leoTer = new Gerente("Leonardo", "30667219", 150000.99);

    System.out.println(leoTer.toString());
    System.out.println("Bonificacion: " + leoTer.getBonificacion());
  }
}
