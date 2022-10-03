package com.ltizzi.jdbc.controller;

import com.ltizzi.jdbc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoController {

  public int modificar(String nombre, String descripcion, Integer cantidad, Integer id)
      throws SQLException {
    Connection con = new ConnectionFactory().recuperaConexion();
    Statement statement = con.createStatement();
    statement.execute(
        "UPDATE producto SET "
            + " NOMBRE = '"
            + nombre
            + "'"
            + ", DESCRIPCION = '"
            + descripcion
            + "'"
            + ", CANTIDAD = "
            + cantidad
            + " WHERE ID = "
            + id);
    int updateCount = statement.getUpdateCount();
    con.close();
    return updateCount;
  }

  public int eliminar(Integer id) throws SQLException {
    Connection con = new ConnectionFactory().recuperaConexion();
    Statement statement = con.createStatement();
    statement.execute("DELETE FROM producto WHERE ID = " + id);
    return statement.getUpdateCount();
  }

  public List<Map<String, String>> listar() throws SQLException {

    Connection con = new ConnectionFactory().recuperaConexion();
    Statement statement = con.createStatement();
    statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM producto");
    ResultSet resultSet = statement.getResultSet(); // result set es listado de resultado

    List<Map<String, String>> resultado = new ArrayList<>();

    while (resultSet.next()) {
      Map<String, String> fila = new HashMap<>();
      fila.put("ID", String.valueOf(resultSet.getInt("ID")));
      fila.put("NOMBRE", resultSet.getString("NOMBRE"));
      fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
      fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));

      resultado.add(fila);
    }

    con.close();
    return resultado;
  }

  public void guardar(Map<String, String> producto) throws SQLException {
    Connection con = (new ConnectionFactory().recuperaConexion());
    Statement statement = con.createStatement();
    statement.execute(
        "INSERT INTO producto(nombre, descripcion, cantidad)"
            + " VALUES('"
            + producto.get("NOMBRE")
            + "', '"
            + producto.get("DESCRIPCION")
            + "', "
            + producto.get("CANTIDAD")
            + ")",
        Statement.RETURN_GENERATED_KEYS);
    ResultSet resultSet = statement.getGeneratedKeys();
    while (resultSet.next()) {
      System.out.println("Fue insertado el producto de la ID " + resultSet.getInt(1));
      resultSet.getInt(1);
    }
  }
}
