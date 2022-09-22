package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ltizzi
 */
public class Ejemplo9 {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Historia", 30);
    Curso curso2 = new Curso("Algebra", 20);
    Curso curso3 = new Curso("Aritmética", 10);
    Curso curso4 = new Curso("Geometría", 40);

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);

    // System.out.println(cursos.toString());
    cursos.sort(Comparator.comparing(Curso::getNombre).reversed());

    int tiempo = 0;
    for (Curso curso : cursos) {
      tiempo += curso.getTiempo();
    }
    System.out.println(tiempo);

    // con stream() es más rápido que con for+if

    System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());

    System.out.println(
        cursos.stream()
            .filter(curso -> !curso.getNombre().equalsIgnoreCase("Algebra"))
            .mapToInt(Curso::getTiempo)
            .sum());
  }
}
