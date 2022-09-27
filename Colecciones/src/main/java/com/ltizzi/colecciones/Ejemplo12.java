/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Alumno;
import com.ltizzi.colecciones.Model.Curso;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ltizzi
 */
public class Ejemplo12 {

  public static void main(String[] args) {
    Alumno alumno1 = new Alumno("Roberto Planta", "001");
    Alumno alumno2 = new Alumno("Juan Pablo Perez", "002");
    Alumno alumno3 = new Alumno("Jeremías Página", "003");
    Alumno alumno4 = new Alumno("Juan Bonachon", "004");
    Alumno alumno5 = new Alumno("Marcía María", "005");
    Alumno alumno6 = new Alumno("Lady Tita", "006");

    // no tienen indices ni añade objetos duplicados
    Set<Alumno> listaAlumnos = new HashSet<>();
    listaAlumnos.add(alumno1);
    listaAlumnos.add(alumno2);
    listaAlumnos.add(alumno3);
    listaAlumnos.add(alumno4);
    listaAlumnos.add(alumno5);
    listaAlumnos.add(alumno6);

    Alumno alumnoNuevo = new Alumno("Roberto Planta", "001");
    listaAlumnos.add(alumnoNuevo);
    System.out.println(alumno1.equals(alumnoNuevo)); // al sobrescribir el equals, da true
    System.out.println(listaAlumnos.contains(alumnoNuevo));

    Curso curso = new Curso("Java", 20);
    curso.addAlumno(alumno1);
    curso.addAlumno(alumno2);
    curso.addAlumno(alumno3);
    curso.addAlumno(alumno4);
    curso.addAlumno(alumno5);
    curso.addAlumno(alumno6);

    System.out.println(curso.getAlumnos().contains(alumnoNuevo));
  }
}
