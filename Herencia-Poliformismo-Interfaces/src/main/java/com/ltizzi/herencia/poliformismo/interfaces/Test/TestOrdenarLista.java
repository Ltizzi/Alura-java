package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaAhorros;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaCorriente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ltizzi
 */
public class TestOrdenarLista {

  // invertir orden Collections.reverse(lista)
  // mezclar Collections.shuffle(lista)
  // rotar Collections.rotate(lista, 5) // rota 5 posiciones

  public static void main(String[] args) {

    Cliente leo = new Cliente("Leo", "", "");
    Cliente pepe = new Cliente("Pepe", "", "");
    Cliente tita = new Cliente("Tita", "", "");
    Cliente pinkie = new Cliente("Pinkie", "", "");

    Cuenta cc1 = new CuentaCorriente(333.0, 33, leo);
    Cuenta cc2 = new CuentaAhorros(444.0, 44, pepe);
    Cuenta cc3 = new CuentaCorriente(111.0, 11, tita);
    Cuenta cc4 = new CuentaAhorros(222.0, 22, pinkie);

    List<Cuenta> lista = new ArrayList<>();
    lista.add(cc1);
    lista.add(cc2);
    lista.add(cc3);
    lista.add(cc4);

    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    // Ordenar las cuentas
    // cualquier clase hija de cuenta
    // Comparator <? extend Cuenta> c
    Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
    Comparator<Cuenta> comparatorNombre = new OrdenadorPorNombreTitular();

    // ambas interfaces funcionales (una interface con un solo metodo) se pueden asignar como
    // parámetros sin encesidad de instanciarlas
    lista.sort(comparator);
    System.out.println("----");
    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    System.out.println("----");
    lista.sort(comparatorNombre);

    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    System.out.println("----");

    Collections.sort(lista, new OrdenadorPorNombreTitular());

    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    System.out.println("----");

    Collections.sort(lista); // orden natural implementado en el objeto cuenta

    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    // function anonima
    lista.sort(
        new Comparator<>() {
          @Override
          public int compare(Cuenta o1, Cuenta o2) {
            return Integer.compare(o1.getNumero(), o2.getNumero());
          }
        });

    // lambda

    lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));
  }
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

  @Override
  public int compare(Cuenta o1, Cuenta o2) {
    //    if (o1.getSaldo() == o2.getSaldo()) {
    //      return 0;
    //    } else if (o1.getSaldo() > o2.getSaldo()) {
    //      return 1;
    //    } else {
    //      return -1;
    //    }
    // FORMA WRAPER
    // return Intenger.compare(o1.getSaldo(), o2.getSaldo());
    //
    return (int) (o1.getSaldo() - o2.getSaldo());
  }
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

  @Override
  public int compare(Cuenta o1, Cuenta o2) {
    return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
  }
}
