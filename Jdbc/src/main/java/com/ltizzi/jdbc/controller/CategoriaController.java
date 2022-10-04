package com.ltizzi.jdbc.controller;

import com.ltizzi.jdbc.dao.CategoriaDAO;
import com.ltizzi.jdbc.factory.ConnectionFactory;
import com.ltizzi.jdbc.modelo.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaController {

  private CategoriaDAO catDAO;

  public CategoriaController() {
    var factory = new ConnectionFactory();
    this.catDAO = new CategoriaDAO(factory.recuperaConexion());
  }

  public List<Categoria> listar() {

    return catDAO.listar();
  }

  public List<Categoria> cargaReporte() {

    return this.catDAO.listarConProductos();
  }
}
