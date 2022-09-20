package com.ltizzi.java.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ltizzi
 */
public class TestLectura2 {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(new File("archivo.csv"), "UTF-8");
    String linea;
    //  System.out.println(linea);

    while (scanner.hasNextLine() && (linea = scanner.nextLine()) != null) {
      //  System.out.println(linea);
      // usando split
      String[] lineas = linea.split(",");
      System.out.println(Arrays.toString(lineas));

      System.out.println(lineas[1]);

      System.out.println(lineas);
      // System.out.println(String.format("%s,%s,%s,%s,%s", lineas));
      // System.out.println(String.format("Diego tiene %d años", 29));

      // usando scanner
      //      Scanner lineaScanner = new Scanner(linea);
      //      lineaScanner.useDelimiter(",");
      //      String valor;
      //      while (lineaScanner.hasNextLine() && (valor = lineaScanner.nextLine()) != null) {
      //        System.out.println(valor);
      //      }
    }
  }
}
