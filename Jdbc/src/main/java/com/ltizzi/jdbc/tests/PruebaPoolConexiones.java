package com.ltizzi.jdbc.tests;

import com.ltizzi.jdbc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ltizzi
 */
public class PruebaPoolConexiones {

  public static void main(String[] args) throws SQLException {
    ConnectionFactory conFactory = new ConnectionFactory();

    for (int i = 0; i < 20; i++) {
      Connection conexion = conFactory.recuperaConexion();
      System.out.println("Abriendo conexión de número " + (i + 1));
    }
  }
}
