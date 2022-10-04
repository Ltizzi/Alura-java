package com.ltizzi.jdbc;

import com.ltizzi.jdbc.view.ControlDeStockFrame;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 * @author ltizzi
 */
public class Jdbc {

  public static void main(String[] args) throws SQLException {
    ControlDeStockFrame produtoCategoriaFrame = new ControlDeStockFrame();
    produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
