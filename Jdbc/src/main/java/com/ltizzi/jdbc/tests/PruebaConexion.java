package com.ltizzi.jdbc.tests;

import com.ltizzi.jdbc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ltizzi
 */
public class PruebaConexion {

  public static void main(String[] args) throws SQLException {

    Connection con = new ConnectionFactory().recuperaConexion();

    con.close();
  }
}
