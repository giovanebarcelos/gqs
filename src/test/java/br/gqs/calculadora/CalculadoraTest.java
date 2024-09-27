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

    @Test
    public void deveSubtrair()
    {
        // Ação - Action 
        int resultado = calculadora.subtrair(13, 8);

        // Verificação - Assert
        assertEquals(5, resultado);
    }

    @Test
    public void deveMultiplicar()
    {
        // Ação - Action 
        int resultado = calculadora.multiplicar(5, 8);

        // Verificação - Assert
        assertEquals(40, resultado);
    }

    @Test
    public void deveDividir() throws DivisionByZeroException
    {
        // Ação - Action 
        int resultado = calculadora.dividir(40, 8);

        // Verificação - Assert
        assertEquals(5, resultado);
    }

    @Test (expected = DivisionByZeroException.class)
    public void nãoDeveDividirPorZero() throws DivisionByZeroException
    {
        // Ação - Action 
        int resultado = calculadora.dividir(40, 0);
    }


}