package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class Cliente implements Auth {
  private String nombre;
  private String documento;
  private String telefono;
  private AuthUtil util;

  public Cliente(String nombre, String documento, String telefono) {
    this.nombre = nombre;
    this.documento = documento;
    this.telefono = telefono;
    this.util = new AuthUtil();
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

  @Override
  public void setClave(String clave) {
    this.util.setClave(clave);
  }

  @Override
  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }
}
