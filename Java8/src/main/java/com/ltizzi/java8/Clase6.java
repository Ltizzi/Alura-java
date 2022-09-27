package com.ltizzi.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author ltizzi
 */
public class Clase6 {

  public static void main(String[] args) {

    List<String> cursos = new ArrayList<>();
    cursos.add("Física");
    cursos.add("Java 8");
    cursos.add("Geometría del espacio");
    cursos.add("Historia universal");

    // sort con lambda
    //    cursos.sort(
    //        (t, t1) -> {
    //          return Integer.compare(t.length(), t1.length());
    //        });

    cursos.sort(Comparator.comparing(String::length).reversed());
    // con referencias solo se puede usar una linea de código
    cursos.forEach(System.out::println);
  }
}
