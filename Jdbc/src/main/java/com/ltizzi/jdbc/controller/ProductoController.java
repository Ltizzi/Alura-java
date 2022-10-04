package com.ltizzi.jdbc.controller;

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

public class ProductoController {

  public int modificar(String nombre, String descripcion, Integer cantidad, Integer id)
      throws SQLException {

    final Connection con = new ConnectionFactory().recuperaConexion();

    // try with resource para el cierre automático de conexiones
    try (con) {
      final PreparedStatement statement =
          con.prepareStatement(
              "UPDATE producto SET "
                  + " NOMBRE = ?"
                  + ", DESCRIPCION = ?"
                  + ", CANTIDAD = ?"
                  + " WHERE ID = ?");
      try (statement) {
        statement.setString(1, nombre);
        statement.setString(2, descripcion);
        statement.setInt(3, cantidad);
        statement.setInt(4, id);
        statement.execute();
        int updateCount = statement.getUpdateCount();
        // con.close();
        return updateCount;
      }
    }
  }

  public int eliminar(Integer id) throws SQLException {
    final Connection con = new ConnectionFactory().recuperaConexion();
    try (con) {
      final PreparedStatement statement = con.prepareStatement("DELETE FROM producto WHERE ID = ?");
      try (statement) {
        statement.setInt(1, id);
        statement.execute();

        return statement.getUpdateCount();
      }
    }
  }

  public List<Map<String, String>> listar() throws SQLException {

    final Connection con = new ConnectionFactory().recuperaConexion();
    try (con) {
      final PreparedStatement statement =
          con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM producto");
      // cambiado createStatement() a prepareStatement para  prevenir sql injection
      try (statement) {
        statement
            .execute(); // antes el string selec id, nombre, descripcion blabla estaba dentro del
        // execute
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
        //      resultSet.close();
        //      con.close();
        return resultado;
      }
    }
  }

  public void guardar(Producto producto) throws SQLException {
    //    String nombre = producto.getNombre();
    //    String descripcion = producto.getDescripcion();
    //    int cantidad = producto.getCantidad();
    // int maximoCantidad = 50;

    final Connection con = (new ConnectionFactory().recuperaConexion());
    try (con) {
      con.setAutoCommit(false); // jdbc no tiene control de la transacción, sino el dev

      // Statement statement = con.createStatement();
      final PreparedStatement statement =
          con.prepareStatement(
              "INSERT INTO producto (nombre, descripcion, cantidad)" + " VALUES(?,?,?)",
              Statement.RETURN_GENERATED_KEYS);

      try (statement) {
        //        do {
        //
        //          int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);

        ejecutaRegistro(statement, producto);

        // cantidad -= maximoCantidad;
        //        } while (cantidad > 0);

        con.commit(); // necesario cuando el commit no es auto
      } catch (Exception e) {
        con.rollback(); // si hay un error en la transacción se hace un rollback
      }
      // no son necesarios por el try with resource
      //      statement.close();
      //      con.close();
    }
  }

  private void ejecutaRegistro(PreparedStatement statement, Producto producto) throws SQLException {

    statement.setString(1, producto.getNombre());
    statement.setString(2, producto.getDescripcion());
    statement.setInt(3, producto.getCantidad());
    statement.execute();

    // try with resources para no tener q estar cerrando conexiónes, resultSet hereda de
    // autoclosable
    final ResultSet resultSet =
        statement
            .getGeneratedKeys(); // java9, con final evito tener q pasar esta linea como argumento
    // del try
    try (resultSet) {

      while (resultSet.next()) {
        producto.setId(resultSet.getInt(1));
        System.out.println("Fue insertado el producto de la ID " + producto.toString());
        resultSet.getInt(1);
      }
    }
  }
}
