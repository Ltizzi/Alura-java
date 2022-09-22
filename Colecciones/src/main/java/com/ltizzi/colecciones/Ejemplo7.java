package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Aula;
import com.ltizzi.colecciones.Model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ltizzi
 */
public class Ejemplo7 {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Java", 30, new ArrayList<>());
    curso1.addAula(new Aula("ArrayList"));
    curso1.addAula(new Aula("List"));
    curso1.addAula(new Aula("LinkedList"));
    curso1.addAula(new Aula("Inmutable"));

    List<Aula> aulaList = curso1.getAulaList();

    // aulaList.add(new Aula("Inmutable"));  //Collections.unmodifiableList( en la clase hace que no
    // se puedan agregar

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);

    System.out.println(cursos.get(0).getAulaList());
    System.out.println(aulaList);
  }
}
