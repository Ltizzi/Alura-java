package com.ltizzi.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ltizzi
 */
public class Clase1 {

  public static void main(String[] args) {
    List<String> cursos = new ArrayList<>();
    cursos.add("Física");
    cursos.add("Java 8");
    cursos.add("Geometría del espacio");
    cursos.add("Historia universal");

    Collections.sort(cursos, new Comparar());
    for (String curso : cursos) {
      System.out.println(curso);
    }
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
