/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 * @author ltizzi
 */
public class TestCopyPaste {

  public static void main(String[] args) throws IOException {
    //
    InputStream fileInputStream = new FileInputStream("texto.txt");
    // InputStream inputStrem = System.in;

    Reader inputStreamReader = new InputStreamReader(fileInputStream);

    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    // Obtener archivo
    OutputStream fileOutputStream = new FileOutputStream("texto-copia.txt");
    // Proceso el archivo
    Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
    // Leer el archivo
    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

    //    System.out.println(linea);
    String linea;
    while ((linea = bufferedReader.readLine()) != null) {
      bufferedWriter.write(linea);
      bufferedWriter.newLine();
    }

    bufferedWriter.close();
  }
}
