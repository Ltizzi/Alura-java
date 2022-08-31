package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public interface Auth {

  // private String clave;

  public void setClave(String clave);

  public boolean iniciarSesion(String clave);
}
