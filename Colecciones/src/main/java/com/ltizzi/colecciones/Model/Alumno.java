package com.ltizzi.colecciones.Model;

import java.util.Objects;

/**
 * @author ltizzi
 */
public class Alumno {

  private String nombre;
  private String codigo;

  public Alumno(String nombre, String codigo) {
    this.nombre = nombre;
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCodigo() {
    return codigo;
  }

  @Override
  public String toString() {
    return "Alumno{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
  }

  @Override
  public boolean equals(Object obj) {
    Alumno alumno = (Alumno) obj;
    return this.nombre.equals(alumno.getNombre());
  }

  @Override
  public int hashCode() {
    return this.nombre.hashCode();
  }
}
