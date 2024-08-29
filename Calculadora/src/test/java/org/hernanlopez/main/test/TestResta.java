package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestResta {

    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    @DisplayName("Prueba Resta")

    void testOperacionResta () {
        double resultado = menuOperaciones.evaluar(12,2.5, '-');
        assertEquals(9.5, resultado, 0);
    }
}
