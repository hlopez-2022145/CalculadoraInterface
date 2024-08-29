package org.hernanlopez.operaciones;

import org.hernanlopez.interfaz.Calculadora;

public class Resta implements Calculadora {
    @Override
    public double ejecutar(double num1, double num2){
        return  num1-num2;
    }
}
