/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltizzi.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ltizzi
 */
public class Ejemplo5 {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Ruby", 30);
    Curso curso2 = new Curso("Javascript", 20);
    Curso curso3 = new Curso("GoLang", 10);
    Curso curso4 = new Curso("Java", 40);

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);

    System.out.println(cursos.toString());

    Collections.sort(cursos);
    System.out.println(cursos);
    Collections.sort(cursos, Collections.reverseOrder());
    System.out.println(cursos);

    cursos.sort(Comparator.comparing(Curso::getNombre).reversed());
    System.out.println(cursos);

    List<Curso> cursos2 =
        cursos.stream()
            .filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby"))
            .sorted(Comparator.comparingInt(Curso::getTiempo))
            .collect(Collectors.toList());
    System.out.println(cursos2);
  }
}
