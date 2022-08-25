package com.ltizzi.primeros.pasos;

public class PrimerosPasos {

  public static void main(String[] args) {

    Cuenta cuenta = new Cuenta();

    cuenta.setNumero(1);
    cuenta.setAgencia(11);
    cuenta.setSaldo(29000.99);

    System.out.println(
        cuenta.getAgencia()
            + cuenta.getNumero()
            + " "
            + +cuenta.getAgencia()
            + " "
            + cuenta.getSaldo()
            + " "
            + cuenta.getTitular());

    // PRIMER CURSO
    //
    //    double numero = 1.23;
    //    double dos = numero + numero;
    //    System.out.println((numero + numero) * dos);
    //    int pepe = (int) numero; // casteo de double a int
    //    System.out.println(pepe);
    //    char character = 65;
    //    System.out.println(character);
    //    character = 65 + 1;
    //    System.out.println(character);
    //    char segundoChar = (char) (character + 1);
    //    System.out.println(segundoChar);
    //    String palabras = "Alura cursos online ";
    //    System.out.println(palabras + character + segundoChar + " 2020");
    //
    //    int edad = 17;
    //    boolean acompaniado = true;
    //    if (edad > 18) {
    //      System.out.println("Usted es mayor");
    //    } else if (edad <= 18 && acompaniado) {
    //      System.out.println("Usted es un pibe pero un pibe acompañado así que puede entrar");
    //    } else {
    //      System.out.println("Ud es un pibe");
    //    }
    //
    //    int contador = 0;
    //    while (contador < 10) {
    //
    //      contador++;
    //      System.out.println(contador);
    //    }
    //
    //    int cont = 0;
    //    int suma = 0;
    //    while (cont < 11) {
    //      suma += cont;
    //      if (cont != 0) {
    //        System.out.println(suma + ", " + cont);
    //      }
    //      cont++;
    //    }
    //    for (int j = 0; j <= 10; j++) {
    //      if (j != 0) System.out.println(j);
    //    }
    //
    //    for (int i = 0; i <= 10; i++) {
    //      System.out.println(" ==================");
    //      for (int j = 0; j <= 10; j++) {
    //
    //        System.out.println(" |   " + i + " x " + j + " = " + (i * j) + "   | ");
    //      }
    //    }
    //    System.out.println("");
    //    for (int i = 0; i <= 10; i++) {
    //      for (int j = 0; j <= 10; j++) {
    //        if (i <= j) {
    //          break;
    //        }
    //        System.out.print("* ");
    //      }
    //      System.out.println("");
    //    }
    //
    //    for (int i = 0; i <= 100; i++) {
    //      if (i % 3 == 0) {
    //        System.out.println(i);
    //      }
    //    }
    //    int factorial = 1;
    //    for (int i = 1; i <= 10; i++) {
    //      factorial *= i;
    //      System.out.println("Resultado : " + i + " " + factorial);
    //    }
    //
    //    System.out.println(10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1);

  }
}
