package com.ltizzi.primeros.pasos;

public class Cliente {

  private String nombre;
  private String documento;
  private String telefono;

  public Cliente(String nombre, String documento, String telefono) {
    this.nombre = nombre;
    this.documento = documento;
    this.telefono = telefono;
  }

  public Cliente() {}

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}
