/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.java8;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author ltizzi
 */
public class Clase2 {

  public static void main(String[] args) {
    List<String> cursos = new ArrayList<>();
    cursos.add("Física");
    cursos.add("Java 8");
    cursos.add("Geometría del espacio");
    cursos.add("Historia universal");

    cursos.sort(new Comparar());

    cursos.forEach(new Consumidor());
  }
}

class Consumidor implements Consumer<String> {

  @Override
  public void accept(String t) {
    System.out.println(t);
  }
}

// ordenar por length de los strings
class Comparar implements Comparator<String> {

  @Override
  public int compare(String t, String t1) {
    if (t.length() > t1.length()) {
      return 1;
    } else if (t.length() < t1.length()) {
      return -1;
    }
    return 0;
  }
}
