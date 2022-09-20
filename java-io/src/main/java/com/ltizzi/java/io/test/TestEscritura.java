package com.ltizzi.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author ltizzi
 */
public class TestEscritura {

  public static void main(String[] args) throws IOException {

    // Obtener archivo
    OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
    // Proceso el archivo
    Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
    // Leer el archivo
    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
    String linea;
    //    System.out.println(linea);

    bufferedWriter.write("Primera línea de mi archivo generado");
    bufferedWriter.newLine();
    bufferedWriter.write("Segunda línea de mi archivo generado");
    bufferedWriter.close();
  }
}
