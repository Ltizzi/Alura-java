package com.ltizzi.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author ltizzi
 */
public class TestSerializacion {

  public static void main(String[] args)
      throws FileNotFoundException, IOException, ClassNotFoundException {

    // Output -> Quien envía el file
    // Input -> Quien recibe el archivo

    // String dato = "Diego";
    //    Cliente dato = new Cliente("Diego", 123456L);
    // Genera el archivo con el dato
    //    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
    //    oos.writeObject(dato);
    //    oos.close();

    //    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
    //    String resultado = (String) ois.readObject();
    //    System.out.println(resultado);

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
    Cliente resultado = (Cliente) ois.readObject();
    System.out.println(resultado.getDocumento());
  }
}
