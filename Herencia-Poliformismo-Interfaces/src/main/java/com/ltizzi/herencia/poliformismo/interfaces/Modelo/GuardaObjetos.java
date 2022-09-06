package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

/**
 * @author ltizzi
 */
public class GuardaObjetos {

  Object[] objetos = new Object[10];
  static int index = 0;

  public void add(Object obj) {
    objetos[index] = obj;
    index++;
  }

  public Object obtener(int index) {
    return objetos[index];
  }
}
