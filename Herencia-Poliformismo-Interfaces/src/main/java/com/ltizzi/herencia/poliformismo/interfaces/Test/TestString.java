package com.ltizzi.herencia.poliformismo.interfaces.Test;

import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cliente;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta;
import static com.ltizzi.herencia.poliformismo.interfaces.Modelo.Cuenta.mostrarCuenta;
import com.ltizzi.herencia.poliformismo.interfaces.Modelo.CuentaCorriente;

/**
 * @author ltizzi
 */
public class TestString {

  public static void main(String[] args) {

    String nombre = "Alura";
    // String nombre2 = new String("Alura"); //no utilizada en el mundo real

    String remplazo =
        nombre.replace(
            "A", "a"); // la clase String es inmutable, por eso hay que asignarlo nuevamente
    String concat = nombre.concat(" cursos online");
    String mayusculas = nombre.toUpperCase();
    String minusculas = nombre.toLowerCase();
    char letra = nombre.charAt(3);
    int indice = nombre.indexOf("r");
    System.out.println(nombre + " " + remplazo + " " + concat);
    System.out.println(mayusculas + " " + minusculas);
    System.out.println(letra + " " + indice);

    StringBuilder builder = new StringBuilder("Ayuda");
    builder.append("-");
    builder.append("me ");
    builder.append("pica ");
    builder.append("el ");
    builder.append("higo.");
    String texto = builder.toString();
    System.out.println(texto + builder);

    printLine(nombre + " " + concat + " " + remplazo + " " + mayusculas + " " + minusculas);
    Cliente leo = new Cliente("Leo", "30667219", "1234");
    Cuenta cuenta = new CuentaCorriente(0, 1, leo);

    printLine(cuenta);
  }

  //  public static void printLine(String valor) {
  //    System.out.println(valor);
  //  }
  //
  //  public static void printLine(int valor) {
  //    System.out.println(valor);
  //  }
  //
  //  public static void printLine(char valor) {
  //    System.out.println(valor);
  //  }

  // la clase Object engloba todo el resto, int String char etc son todos Objects
  public static void printLine(Object valor) {
    System.out.println(valor.toString());
  }
}
