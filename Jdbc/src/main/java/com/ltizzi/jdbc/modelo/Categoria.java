package com.ltizzi.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ltizzi
 */
public class Categoria {

  private Integer id;
  private String nombre;
  private List<Producto> productos;

  public Categoria(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return this.nombre;
  }

  public Integer getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void agregar(Producto producto) {
    if (this.productos == null) {
      this.productos = new ArrayList<>();
    }
    this.productos.add(producto);
  }
}
