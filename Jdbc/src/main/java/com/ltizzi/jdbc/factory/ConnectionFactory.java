package com.ltizzi.jdbc.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 * @author ltizzi
 */
public class ConnectionFactory {

  private DataSource datasource;

  // constructor de la factory usando pool de conexioness
  public ConnectionFactory() {
    var pooledDataSource = new ComboPooledDataSource();
    pooledDataSource.setJdbcUrl(
        "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
    pooledDataSource.setUser("ltizzi");
    pooledDataSource.setPassword("mamapepa");
    pooledDataSource.setMaxPoolSize(10);
    this.datasource = pooledDataSource;
  }

  // FACTORY creadora de conexiones,una clase que solo crea objetos de un tipo específico
  public Connection recuperaConexion() {
    try {
      return this.datasource.getConnection();
    } catch (SQLException ex) {
      throw new RuntimeException(ex);
    }
  }
}
