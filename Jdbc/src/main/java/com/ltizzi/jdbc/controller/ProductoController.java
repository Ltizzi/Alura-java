package com.ltizzi.jdbc.controller;

import com.ltizzi.jdbc.factory.ConnectionFactory;
import com.ltizzi.jdbc.modelo.Producto;
import com.ltizzi.jdbc.dao.ProductoDAO;
import com.ltizzi.jdbc.modelo.Categoria;
import java.sql.SQLException;
import java.util.List;

public class ProductoController {

  private ProductoDAO prodDAO;

  public ProductoController() {
    this.prodDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());
  }

  public int modificar(String nombre, String descripcion, Integer cantidad, Integer id)
      throws SQLException {
    Producto prod = new Producto(id, nombre, descripcion, cantidad);
    return prodDAO.modificar(prod);
    //    final Connection con = new ConnectionFactory().recuperaConexion();
    //
    //    // try with resource para el cierre automático de conexiones
    //    try (con) {
    //      final PreparedStatement statement =
    //          con.prepareStatement(
    //              "UPDATE producto SET "
    //                  + " NOMBRE = ?"
    //                  + ", DESCRIPCION = ?"
    //                  + ", CANTIDAD = ?"
    //                  + " WHERE ID = ?");
    //      try (statement) {
    //        statement.setString(1, nombre);
    //        statement.setString(2, descripcion);
    //        statement.setInt(3, cantidad);
    //        statement.setInt(4, id);
    //        statement.execute();
    //        int updateCount = statement.getUpdateCount();
    //        // con.close();
    //        return updateCount;
    //      }
    //    }
  }

  public Integer eliminar(Integer id) throws SQLException {
    return prodDAO.eliminar(id);
    //    final Connection con = new ConnectionFactory().recuperaConexion();
    //    try (con) {
    //      final PreparedStatement statement = con.prepareStatement("DELETE FROM producto WHERE ID
    // = ?");
    //      try (statement) {
    //        statement.setInt(1, id);
    //        statement.execute();
    //
    //        return statement.getUpdateCount();
    //      }
    //    }
  }

  public List<Producto> listar() throws SQLException {
    return prodDAO.listar();
    //        final Connection con = new ConnectionFactory().recuperaConexion();
    //    try (con) {
    //      final PreparedStatement statement =
    //          con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM producto");
    //      // cambiado createStatement() a prepareStatement para  prevenir sql injection
    //      try (statement) {
    //        statement
    //            .execute(); // antes el string selec id, nombre, descripcion blabla estaba dentro
    // del
    //        // execute
    //        ResultSet resultSet = statement.getResultSet(); // result set es listado de resultado
    //
    //        List<Map<String, String>> resultado = new ArrayList<>();
    //
    //        while (resultSet.next()) {
    //          Map<String, String> fila = new HashMap<>();
    //          fila.put("ID", String.valueOf(resultSet.getInt("ID")));
    //          fila.put("NOMBRE", resultSet.getString("NOMBRE"));
    //          fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
    //          fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));
    //
    //          resultado.add(fila);
    //        }
    //        //      resultSet.close();
    //        //      con.close();
    //        return resultado;
    //      }
  }

  public List<Producto> listar(Categoria cat) {
    return prodDAO.listar(cat.getId());
  }

  public void guardar(Producto producto, Integer categoriaId) throws SQLException {
    producto.setCategoriaId(categoriaId);
    prodDAO.guardarProducto(producto);
    //    String nombre = producto.getNombre();
    //    String descripcion = producto.getDescripcion();
    //    int cantidad = producto.getCantidad();
    // int maximoCantidad = 50;
    //    final Connection con = (new ConnectionFactory().recuperaConexion());
    //    try (con) {
    //      con.setAutoCommit(false); // jdbc no tiene control de la transacción, sino el dev
    //
    //      // Statement statement = con.createStatement();
    //      final PreparedStatement statement =
    //          con.prepareStatement(
    //              "INSERT INTO producto (nombre, descripcion, cantidad)" + " VALUES(?,?,?)",
    //              Statement.RETURN_GENERATED_KEYS);
    //
    //      try (statement) {
    //        //        do {
    //        //
    //        //          int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);
    //
    //        ejecutaRegistro(statement, producto);
    //
    //        // cantidad -= maximoCantidad;
    //        //        } while (cantidad > 0);
    //
    //        con.commit(); // necesario cuando el commit no es auto
    //      } catch (Exception e) {
    //        con.rollback(); // si hay un error en la transacción se hace un rollback
    //      }
    //      // no son necesarios por el try with resource
    //      //      statement.close();
    //      //      con.close();
    //    }
  }

  //  private void ejecutaRegistro(PreparedStatement statement, Producto producto) throws
  // SQLException {
  //
  //    statement.setString(1, producto.getNombre());
  //    statement.setString(2, producto.getDescripcion());
  //    statement.setInt(3, producto.getCantidad());
  //    statement.execute();
  //
  //    // try with resources para no tener q estar cerrando conexiónes, resultSet hereda de
  //    // autoclosable
  //    final ResultSet resultSet =
  //        statement
  //            .getGeneratedKeys(); // java9, con final evito tener q pasar esta linea como
  // argumento
  //    // del try
  //    try (resultSet) {
  //
  //      while (resultSet.next()) {
  //        producto.setId(resultSet.getInt(1));
  //        System.out.println("Fue insertado el producto de la ID " + producto.toString());
  //        resultSet.getInt(1);
  //      }
  //    }
  //  }

}
