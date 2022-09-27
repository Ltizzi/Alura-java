package com.ltizzi.java8;

import com.ltizzi.java8.Model.Curso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * @author ltizzi
 */
public class Clase10 {
  public static void main(String[] args) {

    List<Curso> cursos = new ArrayList<>();
    cursos.add(new Curso("Física", 200));
    cursos.add(new Curso("Java 8", 500));
    cursos.add(new Curso("Geometría del espacio", 400));
    cursos.add(new Curso("Historia universal", 300));

    cursos.sort(Comparator.comparing(Curso::getHoras));
    // con referencias solo se puede usar una linea de código
    //  cursos.stream().filter(x -> x.getHoras() >= 300).forEach(x ->
    // System.out.println(x.getNombre())); // el foreach solo muestra los cursos de 300 o mas horas
    // si
    // lo asocio en la misma linea del stream()

    int suma = cursos.stream().mapToInt(x -> x.getHoras()).sum();
    //  System.out.println(suma);

    OptionalInt max = cursos.stream().mapToInt(x -> x.getHoras()).max();
    // System.out.println(max.getAsInt());

    boolean validaTodos = cursos.stream().allMatch(x -> x.getHoras() > 200);
    // System.out.println(validaTodos);
    //
    //    Optional<Curso> optionalCurso = cursos.stream().filter(x -> x.getHoras() >
    // 200).findFirst();
    //    if (optionalCurso.isPresent()) {
    //      System.out.println(optionalCurso.get().getNombre());
    //    }
    // cursos.stream().filter(x -> x.getHoras() > 300).findFirst().ifPresent(System.out::println);

    Curso curso =
        cursos.stream()
            .filter(x -> x.getHoras() > 300)
            .findFirst()
            .orElse(new Curso("no existe!", 0));
    //    cursos.stream()
    //        .filter(x -> x.getHoras() > 300)
    //        .collect(Collectors.toList())
    //        .forEach(System.out::println);

    //        cursos.stream()
    //        .filter(x -> x.getHoras() > 300)
    //        .collect(Collectors.toMap(Curso::getHoras, Curso::getNombre))
    //        .forEach((llave, valor) -> System.out.println(valor));

    Map<Integer, String> mapaCursos =
        cursos.stream()
            .filter(x -> x.getHoras() > 300)
            .collect(Collectors.toMap(Curso::getHoras, Curso::getNombre));

    mapaCursos.forEach((llave, valor) -> System.out.println(valor));
  }
}
