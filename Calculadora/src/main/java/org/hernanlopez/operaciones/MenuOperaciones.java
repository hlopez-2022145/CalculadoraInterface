package org.hernanlopez.operaciones;

import org.hernanlopez.interfaz.Calculadora;

public class MenuOperaciones {

    public double evaluar(double num1, double num2, char operador) {
        Calculadora realizarOperacion = null;

        realizarOperacion = (operador == '+') ? new Suma(): realizarOperacion;
        realizarOperacion = (operador == '-') ? new Resta(): realizarOperacion;
        realizarOperacion = (operador == '*') ? new Multiplicacion(): realizarOperacion;
        realizarOperacion = (operador == '/') ? new Division(): realizarOperacion;

        return realizarOperacion.ejecutar(num1, num2);
    }
}