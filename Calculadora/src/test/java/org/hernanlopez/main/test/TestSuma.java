package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestSuma {

    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    //añadi un nombre a la prueba para la facilitar la identificación
    @DisplayName("Prueba Suma")
    void testOperacionSuma () {
        double resultado = menuOperaciones.evaluar(12.2, 3.4, '+');
        assertEquals(15.6, resultado, 0);
    }
}
