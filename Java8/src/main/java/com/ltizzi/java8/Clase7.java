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
public class Clase7 {
  public static void main(String[] args) {

    List<Curso> cursos = new ArrayList<>();
    cursos.add(new Curso("Física", 200));
    cursos.add(new Curso("Java 8", 500));
    cursos.add(new Curso("Geometría del espacio", 400));
    cursos.add(new Curso("Historia universal", 300));

    // sort con lambda
    //    cursos.sort(
    //        (t, t1) -> {
    //          return Integer.compare(t.length(), t1.length());
    //        });

    cursos.sort(Comparator.comparing(Curso::getHoras));
    // con referencias solo se puede usar una linea de código
    cursos.stream()
        .filter(x -> x.getHoras() >= 300)
        .forEach(
            x ->
                System.out.println(
                    x.getNombre())); // el foreach solo muestra los cursos de 300 o mas horas si
    // lo asocio en la misma linea del stream()
  }
}

// class Curso {
//  private String nombre;
//  private int horas;
//
//  public Curso(String nombre, int horas) {
//    this.nombre = nombre;
//    this.horas = horas;
//  }
//
//  public String getNombre() {
//    return nombre;
//  }
//
//  public int getHoras() {
//    return horas;
//  }
// }
