package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestMultiplicacion {
    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    @DisplayName("Prueba Multiplicación")

    void testOperacionMultiplicacion () {
        double resultado = menuOperaciones.evaluar(4,5, '*');
        assertEquals(20, resultado, 0);
    }
}
