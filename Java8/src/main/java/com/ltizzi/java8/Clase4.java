/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ltizzi
 */
public class Clase4 {
  public static void main(String[] args) {
    List<String> cursos = new ArrayList<>();
    cursos.add("Física");
    cursos.add("Java 8");
    cursos.add("Geometría del espacio");
    cursos.add("Historia universal");

    // sort con lambda
    cursos.sort(
        (t, t1) -> {
          return Integer.compare(t.length(), t1.length());
        });

    // lambda
    cursos.forEach(
        // no hace falta usar String
        (String s) -> {
          System.out.println(s);
        });
  }
}
