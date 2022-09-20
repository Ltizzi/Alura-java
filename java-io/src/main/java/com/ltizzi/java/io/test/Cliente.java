package com.ltizzi.java.io.test;

import java.io.Serializable;

/**
 * @author ltizzi
 */
public class Cliente implements Serializable {

  private static final long serialVersionUID = 1L;

  private String nombre;
  private Long documento;

  public Cliente(String nombre, Long documento) {
    super();
    this.nombre = nombre;
    this.documento = documento;
  }

  public String getNombre() {
    return nombre;
  }

  public Long getDocumento() {
    return documento;
  }
}
