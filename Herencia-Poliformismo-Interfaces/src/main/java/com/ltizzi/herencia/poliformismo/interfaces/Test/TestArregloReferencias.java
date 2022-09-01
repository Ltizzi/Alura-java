package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaAhorros;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaCorriente;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ltizzi
 */
public class TestArregloReferencias {

  public static void main(String[] args) {
    Cliente leo = new Cliente("Leo", "123", "456");
    CuentaCorriente cc = new CuentaCorriente(0, 1, leo);
    CuentaAhorros ca = new CuentaAhorros(300.99, 2, leo);

    // Cuenta[] cuentas = new Cuenta[5];
    Object[] cuentas = new Object[5];

    cuentas[0] = cc;
    cuentas[1] = new CuentaCorriente(100, 2, leo);
    cuentas[2] = ca;

    System.out.println(cc);
    System.out.println(cuentas[0]);
    System.out.println(cuentas[1]);
    System.out.println(cuentas[2]);
    System.out.println("");

    // casteo
    CuentaCorriente cuenta = (CuentaCorriente) cuentas[3];
    Cliente tita = (Cliente) cuentas[3]; // meter un object Cliente en el array d eobjects casteando

    for (int i = 0; i < cuentas.length; i++) {
      System.out.println(cuentas[i]);
    }

    // forma literal
    int[] refs = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(refs));
  }
}
