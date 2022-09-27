/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author ltizzi
 */
public class Clase11 {

  public static void main(String[] args) {

    LocalDate fechaActual = LocalDate.now().minusMonths(10).plusDays(10);
    System.out.println(fechaActual);

    LocalDate fechaMundial = LocalDate.of(2022, 9, 15);
    System.out.println(ChronoUnit.MONTHS.between(fechaActual, fechaMundial)); // compara fechas
  }
}
