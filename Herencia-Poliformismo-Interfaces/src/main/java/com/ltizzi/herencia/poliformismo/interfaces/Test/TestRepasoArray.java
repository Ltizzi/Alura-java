package com.ltizzi.herencia.poliformismo.interfaces.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ltizzi
 */
public class TestRepasoArray {

  public static void main(String[] args) {

    int[] numeros = new int[10];

    int numero = 40;
    // Wrapper envuelve al primitivo
    // Integer numeroObjeto = new Integer(40); // Integer deprecated
    Integer numeroObjeto = Integer.valueOf(40);

    List lista = new ArrayList();
    lista.add(numero); // autoboxing -> automaticamente, inicializa el primitivo como objeto
    lista.add(numeroObjeto);

    // unboxing
    int valorPrimitivo = numeroObjeto; // int primitivo asignado a la referencia de un objeto
    int valorPri = numeroObjeto.intValue(); // unboxing

    byte byteIntenger = numeroObjeto.byteValue();
    double doubleIntenger = numeroObjeto.doubleValue();
    float floatIntenger = numeroObjeto.floatValue();

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(Integer.BYTES);
  }
}
