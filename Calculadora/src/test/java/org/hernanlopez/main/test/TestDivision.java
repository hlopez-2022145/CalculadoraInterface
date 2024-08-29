package org.hernanlopez.main.test;

import static org.junit.jupiter.api.Assertions.*;
import org.hernanlopez.operaciones.MenuOperaciones;
import org.junit.jupiter.api.*;

public class TestDivision {
    MenuOperaciones menuOperaciones = new MenuOperaciones();

    @Test
    @DisplayName("Prueba División")

    void testOperacionDivision () {
        double resultado = menuOperaciones.evaluar(24,8,'/');
        assertEquals(3, resultado,0);
    }
}
