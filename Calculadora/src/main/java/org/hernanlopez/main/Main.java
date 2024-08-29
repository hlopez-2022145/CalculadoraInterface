package org.hernanlopez.main;

import org.hernanlopez.interfaz.Calculadora;
import org.hernanlopez.operaciones.*;

public class Main {

    public static void main(String[] args) {

        MenuOperaciones menuOperaciones = new MenuOperaciones();

        System.out.println("Suma: " + menuOperaciones.evaluar(5,3, '+'));
        System.out.println("Resta: " + menuOperaciones.evaluar(5,3, '-'));
        System.out.println("Multiplicación: " + menuOperaciones.evaluar(5,3, '*'));
        System.out.println("División: " + menuOperaciones.evaluar(10,5, '/'));

    }
}
