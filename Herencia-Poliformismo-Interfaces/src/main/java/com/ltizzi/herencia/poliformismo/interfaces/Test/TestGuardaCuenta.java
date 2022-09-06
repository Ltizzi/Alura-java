package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaCorriente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.GuardaCuentas;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.GuardaObjetos;

/**
 * @author ltizzi
 */
public class TestGuardaCuenta {

  public static void main(String[] args) {

    GuardaCuentas guardaCuentas = new GuardaCuentas();
    Cliente leo = new Cliente("Leo", "1", "2");
    Cuenta cc = new CuentaCorriente(0, 11, leo);
    Cuenta cc2 = new CuentaCorriente(0, 11, leo);

    guardaCuentas.add(cc);
    guardaCuentas.add(cc2);

    System.out.println(guardaCuentas.obtener(0));
    System.out.println(guardaCuentas.obtener(1));

    GuardaObjetos guardaObj = new GuardaObjetos();

    guardaObj.add(leo);
    guardaObj.add(cc);
    guardaObj.add(cc2);

    System.out.println(guardaObj.obtener(0));
    System.out.println(guardaObj.obtener(1));
    System.out.println(guardaObj.obtener(2));
  }
}
