package com.ltizzi.colecciones.Model;

import java.util.Collections;
import java.util.List;

/**
 * @author ltizzi
 */
public class Curso implements Comparable<Curso> {

  private String nombre;
  private int tiempo;
  private List<Aula> aulaList;

  public Curso(String nombre, int tiempo) {
    this.nombre = nombre;
    this.tiempo = tiempo;
  }

  public Curso(String nombre, int tiempo, List<Aula> claseList) {
    this.nombre = nombre;
    this.tiempo = tiempo;
    this.aulaList = claseList;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTiempo() {
    return tiempo;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public List<Aula> getAulaList() {
    return Collections.unmodifiableList(aulaList);
  }

  public void setAulaList(List<Aula> aulaList) {
    this.aulaList = aulaList;
  }

  public void addAula(Aula clase) {
    this.aulaList.add(clase);
  }

  @Override
  public String toString() {
    return nombre + ", " + tiempo;
  }

  @Override
  public int compareTo(Curso t) {
    return this.nombre.compareTo(t.getNombre());
  }
}
