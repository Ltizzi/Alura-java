package com.ltizzi.colecciones;

import java.util.ArrayList;

/**
 * @author ltizzi
 */
public class Ejemplo2 {

  public static void main(String[] args) {
    String variable1 = "Clase 1";
    String variable2 = "Clase 2";
    String variable3 = "Clase 3";
    String variable4 = "Clase 4";

    ArrayList<String> lista = new ArrayList<>();

    lista.add(variable1);
    lista.add(variable2);
    lista.add(variable3);
    lista.add(variable4);

    System.out.println(lista);
    //    lista.remove(2);
    lista.set(2, "Ejemplo alterado");
    System.out.println(lista);
    System.out.println(lista.size());

    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }

    for (String clase : lista) {
      System.out.println(clase);
    }

    lista.forEach(
        clase -> {
          System.out.println(clase);
        });
  }
}
