package br.com.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(15, calculadora.somar(10, 5));
    }

    @Test
    void deveSubtrairDoisNumeros() {
        assertEquals(5, calculadora.subtrair(10, 5));
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        assertEquals(50, calculadora.multiplicar(10, 5));
    }

    @Test
    void deveImpedirDivisaoPorZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );
    }
}