package com.ltizzi.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ltizzi
 */
public class ConnectionFactory {

  // FACTORY creadora de conexiones,una clase que solo crea objetos de un tipo específico
  public Connection recuperaConexion() throws SQLException {
    return DriverManager.getConnection(
        "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
        "ltizzi",
        "mamapepa");
  }
}
