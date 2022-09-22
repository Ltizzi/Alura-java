package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Curso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ltizzi
 */
public class Ejemplo10 {
  public static void main(String[] args) {
    Curso curso1 = new Curso("Historia", 30);
    Curso curso2 = new Curso("Algebra", 20);
    Curso curso3 = new Curso("Algebra", 10);
    Curso curso4 = new Curso("Geografía", 40);
    Curso curso5 = new Curso("Literatura", 40);
    Curso curso6 = new Curso("Historia", 30);
    Curso curso7 = new Curso("Inglés", 20);
    Curso curso8 = new Curso("Educación Física", 10);

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);
    cursos.add(curso5);
    cursos.add(curso6);
    cursos.add(curso7);
    cursos.add(curso8);

    // con stream() es más rápido que con for+if

    System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());

    System.out.println(
        cursos.stream()
            .filter(curso -> !curso.getNombre().equalsIgnoreCase("Algebra"))
            .mapToInt(Curso::getTiempo)
            .sum());
    System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
    System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
    System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());

    Map<String, List<Curso>> groupCurso =
        cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
    groupCurso.forEach((key, value) -> System.out.println(key + ", " + value.size()));

    // recorre en paralelo
    System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
  }
}
