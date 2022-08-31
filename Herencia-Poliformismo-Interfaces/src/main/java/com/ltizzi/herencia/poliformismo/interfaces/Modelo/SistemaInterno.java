package com.ltizzi.herencia.poliformismo.interfaces.Modelo;

public class SistemaInterno {

  private String clave = "12345";

  public boolean autentica(Auth auth) {
    boolean puedeIniciarSesion = auth.iniciarSesion(clave);
    if (puedeIniciarSesion) {
      System.out.println("Login exitoso");
      return true;
    } else {
      System.out.println("Error en login");
      return false;
    }
  }
}
