package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class ControlBonificacion {
  private double suma;

  // solo con la clase madre se puede usar un método para todas las clases hijas
  // ejemplo claro de polimorfismo
  // por lo que no hacen falta metodos especificos para cada clase hija
  public double registrarSalario(Funcionario func) {
    this.suma = func.getBonificacion() + this.suma;
    System.out.println("calculo actual : " + this.suma);
    return this.suma;
  }

  //  public double registrarSalario(Gerente gerente) {
  //    this.suma = gerente.getBonificacion() + this.suma;
  //    System.out.println("calculo actual : " + this.suma);
  //    return this.suma;
  //  }
  //
  //  public double registrarSalario(Contador cont) {
  //    this.suma = cont.getBonificacion() + this.suma;
  //    System.out.println("calculo actual : " + this.suma);
  //    return this.suma;
  //  }
}
