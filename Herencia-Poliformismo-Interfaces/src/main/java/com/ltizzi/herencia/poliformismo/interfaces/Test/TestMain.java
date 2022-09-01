package com.ltizzi.herencia.poliformismo.interfaces.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ltizzi
 */
public class TestMain {

  public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

    int edad = 20;
    int edad2 = 15;
    int edad3 = 67;

    int[] edades = new int[3];
    edades[0] = edad;
    edades[1] = edad2;
    edades[2] = edad3;

    System.out.println(Arrays.toString(edades));

    int arrayLength = edades.length;
    for (int i = 0; i < arrayLength; i++) {
      System.out.println(edades[i]);
    }
  }
}
