package com.ltizzi.colecciones;

import com.ltizzi.colecciones.Model.Alumno;
import com.ltizzi.colecciones.Model.Curso;
import java.util.Optional;

/**
 * @author ltizzi
 */
public class Ejemplo15 {
  public static void main(String[] args) {
    Alumno alumno1 = new Alumno("Roberto Planta", "001");
    Alumno alumno2 = new Alumno("Juan Pablo Perez", "002");
    Alumno alumno3 = new Alumno("Jeremías Página", "003");
    Alumno alumno4 = new Alumno("Juan Bonachon", "004");
    Alumno alumno5 = new Alumno("Marcía María", "005");
    Alumno alumno6 = new Alumno("Lady Tita", "006");

    Curso curso = new Curso("Java", 20);
    curso.addAlumno(alumno1);
    curso.addAlumno(alumno2);
    curso.addAlumno(alumno3);
    curso.addAlumno(alumno4);
    curso.addAlumno(alumno5);
    curso.addAlumno(alumno6);

    //  curso.getAlumnos().forEach(alumno -> System.out.println(alumno));

    Alumno alumnoMap = curso.getAlumnoMap().get("003");
    //  System.out.println(alumnoMap);

    curso
        .getAlumnoMap()
        .forEach(
            (codigo, alumno) -> {
              System.out.println(alumno);
            });
  }
}
