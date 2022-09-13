package com.ltizzi.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ltizzi
 */
public class TestLectura {

  public static void main(String[] args) throws IOException {

    // Obtener archivo
    FileInputStream fileInputStream = new FileInputStream("texto.txt");
    // Proceso el archivo
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    // Leer el archivo
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String linea;
    //    System.out.println(linea);

    while ((linea = bufferedReader.readLine()) != null) {

      System.out.println(linea);
    }
  }
}
