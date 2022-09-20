package com.ltizzi.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author ltizzi
 */
public class TestEscrituraFileWriter {
  public static void main(String[] args) throws IOException {

    // File writer abstrae todo el código de TestEscritura y nos permite manipular directamente

    FileWriter fileWriter = new FileWriter("texto-file-writer.txt");
    fileWriter.write("primer línea vía file writer");
    fileWriter.write(System.lineSeparator()); // atrapa el salto de linea según el OS
    fileWriter.write("segunda línea vía file writer");
    fileWriter.close();
  }
}
