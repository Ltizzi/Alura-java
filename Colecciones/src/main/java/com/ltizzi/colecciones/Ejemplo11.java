package com.ltizzi.colecciones;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ltizzi
 */
public class Ejemplo11 {

  public static void main(String[] args) {
    String alumno1 = "Roberto Planta";
    String alumno2 = "Juan Pablo Perez";
    String alumno3 = "Jeremías Página";
    String alumno4 = "Juan Bonachon";
    String alumno5 = "Marcía María";
    String alumno6 = "Lady Tita";

    // no tienen indices ni añade objetos duplicados
    Set<String> listaAlumnos = new HashSet<>();
    listaAlumnos.add(alumno1);
    listaAlumnos.add(alumno2);
    listaAlumnos.add(alumno3);
    listaAlumnos.add(alumno4);
    listaAlumnos.add(alumno5);
    listaAlumnos.add(alumno6);

    for (String alumno : listaAlumnos) {
      System.out.println(alumno);
    }

    boolean valida = listaAlumnos.contains("Roberto Planta");
    System.out.println(valida);

    String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
    System.out.println(max);

    listaAlumnos.removeIf(alumno -> "Roberto Planta".equalsIgnoreCase(alumno));

    listaAlumnos.forEach(
        alumno -> {
          System.out.println(alumno);
        });
  }
}
