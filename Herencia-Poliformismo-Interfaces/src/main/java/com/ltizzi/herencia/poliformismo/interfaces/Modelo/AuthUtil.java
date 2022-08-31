package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class AuthUtil {
  private String clave;

  public boolean iniciarSesion(String clave) {
    return this.clave == clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }
}
