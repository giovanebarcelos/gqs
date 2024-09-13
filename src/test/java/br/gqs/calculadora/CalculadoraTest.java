package br.gqs.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    // AAA
    // Arrange - Act - Assert
    Calculadora calculadora;

    @Before 
    public void setUp()
    {
        // Cenário - Arrange
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomar()
    {
        // Ação - Action 
        int resultado = calculadora.somar(13, 8);

        // Verificação - Assert
        assertEquals(21, resultado);
    }
}