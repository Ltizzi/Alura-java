package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Aula;
import com.ltizzi.colecciones.Model.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ltizzi
 */
public class Ejemplo6 {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Java", 30, new ArrayList<>());
    curso1.addAula(new Aula("ArrayList"));
    curso1.addAula(new Aula("List"));
    curso1.addAula(new Aula("LinkedList"));

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);

    System.out.println(cursos.get(0).getAulaList());
  }
}
