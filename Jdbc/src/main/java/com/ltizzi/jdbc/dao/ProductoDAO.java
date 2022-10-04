package com.ltizzi.jdbc.dao;

import com.ltizzi.jdbc.factory.ConnectionFactory;
import com.ltizzi.jdbc.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ltizzi
 */

// DAO DATA ACCESS OBJECT
public class ProductoDAO {

  private final Connection con;

  public ProductoDAO(Connection con) {
    this.con = con;
  }

  public void guardarProducto(Producto producto) {

    PreparedStatement statement;
    try {
      statement =
          con.prepareStatement(
              "INSERT INTO producto (nombre, descripcion, cantidad, categoria_id)"
                  + " VALUES(?,?,?,?)",
              Statement.RETURN_GENERATED_KEYS);
      try (statement) {
        statement.setString(1, producto.getNombre());
        statement.setString(2, producto.getDescripcion());
        statement.setInt(3, producto.getCantidad());
        statement.setInt(4, producto.getCategoriaId());
        statement.execute();

        final ResultSet resultSet = statement.getGeneratedKeys();
        try (resultSet) {

          while (resultSet.next()) {
            producto.setId(resultSet.getInt(1));
            System.out.println("Fue insertado el producto de la ID " + producto.toString());
            // resultSet.getInt(1);
          }
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public List<Producto> listar() {

    try {
      final PreparedStatement statement =
          con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM producto");
      // cambiado createStatement() a prepareStatement para  prevenir sql injection
      try (statement) {
        statement
            .execute(); // antes el string selec id, nombre, descripcion blabla estaba dentro del
        // execute
        ResultSet resultSet = statement.getResultSet(); // result set es listado de resultado

        List<Producto> resultado = new ArrayList<>();

        while (resultSet.next()) {
          Producto fila =
              new Producto(
                  resultSet.getInt("ID"),
                  resultSet.getString("NOMBRE"),
                  resultSet.getString("DESCRIPCION"),
                  resultSet.getInt("CANTIDAD"));

          resultado.add(fila);
        }
        //      resultSet.close();
        //      con.close();
        return resultado;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  //
  //  private void ejecutaRegistro(PreparedStatement statement, Producto producto)
  //      throws SQLException {}

  public int eliminar(Integer id) throws SQLException {

    try {
      final PreparedStatement statement = con.prepareStatement("DELETE FROM producto WHERE ID = ?");
      try (statement) {
        statement.setInt(1, id);
        statement.execute();

        return statement.getUpdateCount();
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public int modificar(Producto prod) {

    try {
      final PreparedStatement statement =
          con.prepareStatement(
              "UPDATE producto SET "
                  + " NOMBRE = ?"
                  + ", DESCRIPCION = ?"
                  + ", CANTIDAD = ?"
                  + " WHERE ID = ?");
      try (statement) {
        statement.setString(1, prod.getNombre());
        statement.setString(2, prod.getDescripcion());
        statement.setInt(3, prod.getCantidad());
        statement.setInt(4, prod.getId());
        statement.execute();
        int updateCount = statement.getUpdateCount();
        return updateCount;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public List<Producto> listar(Integer categoriaId) {

    try {
      final PreparedStatement statement =
          con.prepareStatement(
              "SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD "
                  + " FROM producto "
                  + " WHERE categoria_id = ?");

      try (statement) {
        statement.setInt(1, categoriaId);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        List<Producto> resultado = new ArrayList<>();

        while (resultSet.next()) {
          Producto fila =
              new Producto(
                  resultSet.getInt("ID"),
                  resultSet.getString("NOMBRE"),
                  resultSet.getString("DESCRIPCION"),
                  resultSet.getInt("CANTIDAD"));

          resultado.add(fila);
        }

        return resultado;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
