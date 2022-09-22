package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Curso;
import java.util.ArrayList;

/**
 * @author ltizzi
 */
public class Ejemplo4 {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Geometría", 30);
    Curso curso2 = new Curso("Física", 30);
    Curso curso3 = new Curso("Química", 30);
    Curso curso4 = new Curso("Historia", 30);

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);

    System.out.println(cursos.toString());
  }
}
