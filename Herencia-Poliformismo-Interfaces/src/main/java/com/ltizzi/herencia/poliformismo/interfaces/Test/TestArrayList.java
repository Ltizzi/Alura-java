package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaCorriente;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ltizzi
 */
public class TestArrayList {

  public static void main(String[] args) {

    // List (hereda de Collection)
    // ArrayList, LinkedList, Vector
    // ArrayList = mas usada
    // LinkedList cada eslabon de la lista tiene un nexo con el eslabón contiguo (un parámetro
    // indica cuál es el otro
    // Vector es similar a un ArrayList pero es Thread Safe, es decir, una única instancia se
    // encarga de ejecutar la manipulación de la lista.

    // el primer parametro entre <> es obligatorio, el dgundo (en la asignación), no
    List<Cuenta> lista =
        new ArrayList<>(); // el parámetro entre <> fuerza a que solo se use un tipo de objetos -
    // generics
    Cliente titular = new Cliente("leo", "", "");
    Cuenta cc = new CuentaCorriente(50, 1, titular);
    Cuenta cc2 = new CuentaCorriente(100, 2, titular);
    Cuenta cc3 = new CuentaCorriente(50, 1, titular);

    lista.add(cc);
    lista.add(cc2);
    // lista.add(cc3);

    Cuenta obtenerCuenta = lista.get(0);
    System.out.println(obtenerCuenta);

    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    boolean contiene = lista.contains(cc);

    // cc3 es, por parámetros, igual a cc pero no refieren al mismo objeto
    if (lista.contains(cc3)) {
      System.out.println("Si, es igual usando equals");
    }
  }
}
