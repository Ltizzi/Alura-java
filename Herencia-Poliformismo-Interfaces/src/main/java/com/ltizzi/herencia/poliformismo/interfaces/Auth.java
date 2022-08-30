package com.ltizzi.herencia.poliformismo.interfaces;

public interface Auth {

  // private String clave;

  public void setClave(String clave);

  public boolean iniciarSesion(String clave);
}
