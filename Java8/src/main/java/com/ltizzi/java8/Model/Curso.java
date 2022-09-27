/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.java8.Model;

/**
 * @author ltizzi
 */
public class Curso {
  private String nombre;
  private int horas;

  public Curso(String nombre, int horas) {
    this.nombre = nombre;
    this.horas = horas;
  }

  public String getNombre() {
    return nombre;
  }

  public int getHoras() {
    return horas;
  }

  @Override
  public String toString() {
    return this.nombre.concat(" - ").concat(String.valueOf(this.getHoras()));
  }
}
